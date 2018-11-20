package com.wyj.dp.cor;

/**
 * ratify: 批准 认可
 *
 * Created
 * Author: wyj
 * Date: 2018/11/20
 */
public interface Ratify {

    Result deal(Chain chain);

    interface Chain {
        Result proceed(Request request);
        Request getRequest();
    }

}
