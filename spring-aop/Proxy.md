### ProxyConfig及其子类

#### 子类

- ScopedProxyFactoryBean 作用域bean代理
- ProxyProcessorSupport 代理对象处理器的支持类，类加载器管理和评估代理结果算法，参见 {@link #ProxyProcessorSupport.evaluateProxyInterfaces} 方法
    - AbstractAdvisingBeanPostProcessor（当前接口和子接口后续再看）
        - AbstractBeanFactoryAwareAdvisingPostProcessor
            - MethodValidationPostProcessor
            - AsyncAnnotationBeanPostProcessor
            - PersistenceExceptionTranslationPostProcessor
        - AbstractAutoProxyCreator（重点）
            - BeanNameAutoProxyCreator
            - AbstractAdvisorAutoProxyCreator（重点）AdvisedSupport
                - DefaultAdvisorAutoProxyCreator
                - AspectJAwareAdvisorAutoProxyCreator（重点）
                    - AnnotationAwareAspectJAutoProxyCreator（重点）
                - InfrastructureAdvisorAutoProxyCreator
- AbstractSingletonProxyFactoryBean 一个处理单例bean的、FactoryBean类型的基类，提供拦截器前后的管理功能
    - TransactionProxyFactoryBean
    - CacheProxyFactoryBean
- AdvisedSupport 持有aop配置的代理工厂的基类，子类是拥有不同配置的代理工厂
    - ProxyCreatorSupport
        - ProxyFactoryBean
        - ProxyFactory
        - AspectJProxyFactory

### 易混淆的类

#### Advice、Advisor、Advised

- Advised：aop代理工厂的顶级接口，配置包括拦截器、通知和其他代理接口，也就是实现类是工厂类
- Advisor：包装advice，确定advice的适用性
- Advice：通知的顶级接口，实现有前置通知，后置通知，环绕通知等

### PointCut

### Advice及其子类

#### 子类

- AbstractAspectJAdvice（子类对开发中通知的处理）
    - AspectJAfterReturningAdvice（重点）
    - AspectJAfterAdvice（重点）
    - AspectJAroundAdvice（重点）
    - AspectJMethodBeforeAdvice（重点）
    - AspectJAfterThrowingAdvice（重点）
- DynamicIntroductionAdvice
    - IntroductionInterceptor
        - DelegatingIntroductionInterceptor
        - DelegatePerTargetObjectIntroductionInterceptor
- Interceptor
    - MethodInterceptor（重点）
    - ConstructorInterceptor（spring尚未有实现）
- BeforeAdvice 标记通知为前置通知，前置相关的通知都会实现
    - MethodBeforeAdvice 前置通知回调
        - AspectJMethodBeforeAdvice（重点）
    - MethodBeforeAdviceInterceptor 前置通知回调拦截器，通过MethodBeforeAdviceAdapter.getInterceptor()
      方法获取，在DefaultAdvisorAdapterRegistry中注入到AdvisorAdapter列表中
- AfterAdvice 标志通知为后置通知，后置相关的通知都会实现
    - ThrowsAdvice 异常通知
    - ThrowsAdviceInterceptor 异常通知回调拦截器，通过ThrowsAdviceAdapter.getInterceptor()
      方法获取，在DefaultAdvisorAdapterRegistry中注入到AdvisorAdapter列表中
    - AspectJAfterReturningAdvice（重点）
    - AspectJAfterAdvice（重点）
    - AspectJAfterThrowingAdvice（重点）
    - AfterReturningAdvice 方法返回通知
        - AspectJAfterReturningAdvice（重点）
    - AfterReturningAdviceInterceptor 方法返回通知拦截器，通过AfterReturningAdviceAdapter.getInterceptor()
      方法获取，在DefaultAdvisorAdapterRegistry中注入到AdvisorAdapter列表中

### MethodInvocation及其子类

### 代理的入口

#### @EnableAspectJAutoProxy

#### AspectJAutoProxyRegistrar

#### AbstractAutoProxyCreator与AnnotationAwareAspectJAutoProxyCreator

### 循环依赖与循环代理之间的关系

### AspectJAdvisorFactory

### AspectInstanceFactory

### BeanFactoryAspectJAdvisorsBuilder

### ExposeInvocationInterceptor
