package com.wyj.dp.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 关于cglib 再多说几句。
 *
 * cglib 代理可以直接代理类，不像jdk只能是接口。
 *
 * cglib是一个高性能的动态代码生成包，底层使用了小而快的字节码处理框架ASM，来通过代码直接创建字节码class 文件的，
 *
 * 需要注意的是 被代理类不能为final；如果方法是final，不会被拦截。（我认为 其实是可以的，但是cglib动态代理遵守了Java语法规范）
 *
 *
 * Created
 * Author: wyj
 * Date: 2019/4/18
 */
public class CGLIBProxyFactory implements MethodInterceptor {

    private Object target;

    public CGLIBProxyFactory(Object target) {
        this.target = target;
    }

    public Object newInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("cglib proxy before invoke. obj:%s, args:%s, methodProxy:%s");
        Object ret = method.invoke(target, args);
        System.out.println("cglib proxy after invoke");
        return ret;
    }
}
