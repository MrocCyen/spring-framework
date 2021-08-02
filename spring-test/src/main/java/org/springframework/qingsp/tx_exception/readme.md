### 事务常见问题1

#### 事务配置

- 外层事务回滚的异常和内层事务回滚的异常不同，内层事务回滚事务和内层事务抛出的异常相同，比如外层回滚异常为A，内层事务回滚异常为B，内层事务抛出异常为B
- 内部事务抛出的异常不是RuntimeException和Error的子类
- 内层和外层事务都没有进行异常捕获

#### 出现问题

出现UnexpectedRollbackException异常信息，并提示Transaction rolled back because it has been marked as rollback-only

#### 原因分析

1、内层事务由于某些原因，出现异常，内层事务这时进行事务的回滚，设置了全局事务回滚标志；外层事务由于实际产生的异常和回滚异常不相同，
并且内部事务抛出的异常不是RuntimeException和Error的子类，这时不会直接进行回滚，会进行提交；

2、在提交事务的时候，会再次检查事务是否可以回滚， 这时由于设置了全局回滚标志，这时会进行回滚；但是这个回滚是意外的，也就是回滚参数会被设置为unexpected=true，
这就导致了nexpectedRollbackException异常信息；事务提交函数如下：

``` java
@Override
public final void commit(TransactionStatus status) throws TransactionException {
    //如果事务已经提交，抛异常
    if (status.isCompleted()) {
        throw new IllegalTransactionStateException(
                "Transaction is already completed - do not call commit or rollback more than once per transaction");
    }

    DefaultTransactionStatus defStatus = (DefaultTransactionStatus) status;
    //todo 当前事务状态的回滚标志被置为了true，需要回滚事务
    if (defStatus.isLocalRollbackOnly()) {
        if (defStatus.isDebug()) {
            logger.debug("Transactional code has requested rollback");
        }
        processRollback(defStatus, false);
        return;
    }

    //todo shouldCommitOnGlobalRollbackOnly 是否可以根据全局回滚事务标志进行事务的回滚
    if (!shouldCommitOnGlobalRollbackOnly() && defStatus.isGlobalRollbackOnly()) {
        if (defStatus.isDebug()) {
            logger.debug("Global transaction is marked as rollback-only but transactional code requested commit");
        }
        processRollback(defStatus, true);
        return;
    }

    //进行事务提交
    processCommit(defStatus);
}
```

#### 解决方案

最外层事务中添加catch代码，将外层事务状态值设置成回滚

``` java
catch (Throwable ex) {
    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
    throw ex;
}
```