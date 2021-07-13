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
    - MethodInterceptor（重点，实现链式调用的基础）
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
      
#### 5个通知具体说明
- AspectJAfterReturningAdvice（@AfterReturning）
  
  继承AfterReturningAdvice，AfterReturningAdvice对应一个AfterReturningAdviceInterceptor和AfterReturningAdviceAdapter

- AspectJAfterAdvice（@After）
  
- AspectJAfterThrowingAdvice（@AfterThrowing）
  
- AspectJMethodBeforeAdvice（@Before）
  
  继承MethodBeforeAdvice，MethodBeforeAdvice对应一个MethodBeforeAdviceInterceptor和MethodBeforeAdviceAdapter

- AspectJAroundAdvice（@Around）

### 概念

- PointCut：切点，表示具体要处理哪些方法，怎么切入
- JoinPoint：连接点，这里具体表示一个执行的方法
- Advice：通知，具体的处理逻辑，前置，后置等
- Aspect：切面，表示一个切点定义了切入的连接点（方法），然后针对这些方法，要执行哪些通知（前置，后置等处理）
- weave：织入，标识spring通过切面生成代理对象的过程

### MethodInterceptor

### MethodInvocation及其子类

### 代理的入口

#### @EnableAspectJAutoProxy

#### AspectJAutoProxyRegistrar

#### AdvisorAdapter

### ExposeInvocationInterceptor

#### DefaultAdvisorAdapterRegistry与GlobalAdvisorAdapterRegistry

#### AbstractAutoProxyCreator与AnnotationAwareAspectJAutoProxyCreator
AnnotationAwareAspectJAutoProxyCreator的findCandidateAdvisors()方法，内部调用BeanFactoryAspectJAdvisorsBuilder.buildAspectJAdvisors()方法

### BeanFactoryAspectJAdvisorsBuilder
buildAspectJAdvisors()方法，根据@AspectJ注解构建advisor；根据AspectJAdvisorFactory.getAdvisors()方法获取advisor

### AspectJAdvisorFactory
构建Advisor的工厂类，子类实现ReflectiveAspectJAdvisorFactory，根据通知的类型创建不同的通知，类型根据注解@Around，@Before，@After，@AfterReturning，@AfterThrowing

### InstantiationModelAwarePointcutAdvisorImpl

### AspectInstanceFactory

AspectJ实例对象的工厂类

#### 子类

##### MetadataAwareAspectInstanceFactory

增加了获取AspectMetadata的能力

- SimpleMetadataAwareAspectInstanceFactory
  
具有SimpleAspectInstanceFactory的能力，构造函数内创建AspectMetadata对象

- SingletonMetadataAwareAspectInstanceFactory

具有SingletonAspectInstanceFactory的能力，构造函数内创建AspectMetadata对象
  
- BeanFactoryAspectInstanceFactory

每一个getAspectInstance调用都从bean工厂中获取

- PrototypeAspectInstanceFactory-继承自BeanFactoryAspectInstanceFactory
  
原型bean的AspectJ对象，也是从从bean工厂中获取
    
- LazySingletonAspectInstanceFactoryDecorator

内部代理一个MetadataAwareAspectInstanceFactory对象

##### SingletonAspectInstanceFactory

AspectJ实例对象通过构造函数传入，每一个getAspectInstance调用都是一样的

- SingletonMetadataAwareAspectInstanceFactory

##### SimpleBeanFactoryAwareAspectInstanceFactory

##### SimpleAspectInstanceFactory

为每一个getAspectInstance调用创建一个新的对象

- SimpleMetadataAwareAspectInstanceFactory