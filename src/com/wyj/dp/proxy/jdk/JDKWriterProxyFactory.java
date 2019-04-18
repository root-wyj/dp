package com.wyj.dp.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * 关于使用 动态代理，Mybatis 使用 MapperProxy 代理 Mapper接口，就是 最最最好的示例。
 *
 * 代理方面那里面涉及两个主要的类：ProxyFactory：org.apache.ibatis.binding.MapperProxyFactory<T>
 *     Proxy(InvocationHandler)：org.apache.ibatis.binding.MapperProxy<T>
 *
 * Proxy.newProxyInstance 方法就是会用 给定类加载器，生成一个 实现了给定接口，调用时会通过 给定Handler invoke调用的对象。
 * 上面这句话很重要，对于透彻理解Proxy，对于理解Mybatis中的代理 都很重要。
 *
 * mybatis 和我们的一般代理有些不同，因为一般代理需要真正的调用被代理对象，也就是我们这里的method.invoke(target, args).
 * 而mybatis是接口，并没有实现，所以也不需要真正的调用实现。所以在创建mapper代理对象的时候，并不需要传递对象，只需要传递接口。
 * 另外，在我们真正调用拿到的接口的各个方法的时候，MapperProxy 是怎么处理的，如果是Object默认提供的方法，传入的target是this，
 * 也就是本身，也就是说调用Mapper.toString，就是调用MapperProxy.toString 而这里MapperProxy implements InvocationHandler，
 * 但是呢，并不影响方法的调用。。 而对于Mapper Interface中申明的方法，就解析出method的各种属性，然后交给sqlSession去处理了。
 *
 * mybatis中 MapperProxy 对动态代理的应用真的太灵活了！！！
 *
 * Author: wyj
 * Date: 2019/4/18
 */
public class JDKWriterProxyFactory {

    private Object target;

    public JDKWriterProxyFactory(Object target) {
        this.target = target;
    }

    public Object newInstance(JDKWriterProxy proxy) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), proxy);
    }

    public Object newInstance() {
        return newInstance(new JDKWriterProxy(target));
    }

}
