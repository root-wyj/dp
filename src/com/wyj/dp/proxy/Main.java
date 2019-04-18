package com.wyj.dp.proxy;

import com.wyj.dp.proxy.cglib.CGLIBProxyFactory;
import com.wyj.dp.proxy.jdk.JDKWriterProxyFactory;

/**
 * Created
 * Author: wyj
 * Date: 2019/4/18
 */
public class Main {

    public static void main(String[] args) {
        Writer writer = new Writer();
        JDKWriterProxyFactory jdkWriterProxyFactory = new JDKWriterProxyFactory(writer);
        IWrite writeJDKProxy = (IWrite) jdkWriterProxyFactory.newInstance();
        writeJDKProxy.write();

        CGLIBProxyFactory cglibProxyFactory = new CGLIBProxyFactory(writer);
        Writer cglibProxyWriter = (Writer) cglibProxyFactory.newInstance();
        cglibProxyWriter.write();
    }
}
