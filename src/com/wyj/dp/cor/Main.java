package com.wyj.dp.cor;


/**
 * Created
 * Author: wyj
 * Date: 2018/11/20
 */
public class Main {

    public static void main(String[] args) {

        Request request = new Request.Builder()
                .setName("小明")
                .setDays(10)
                .setReason("常回家看看")
                .build();

        Ratify.Chain chain = SimpleChainFactory.getSimpleChain(request);
        Result result = chain.proceed(request);

        System.out.println("result:"+result);
        System.out.println("request:"+request);
    }
}
