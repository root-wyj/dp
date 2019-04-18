package com.wyj.dp.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理通常会使用一个工厂(这里是 JDKWriterProxyFactory)来创建代理类
 * Author: wyj
 * Date: 2019/4/18
 */
public class JDKWriterProxy implements InvocationHandler {

    private Object target;

    public JDKWriterProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDKProxy before:");
        Object ret = method.invoke(target, args);
        System.out.println("JDKProxy after, ret:"+ret+", args:{}" + args);
        return ret;
    }
}
