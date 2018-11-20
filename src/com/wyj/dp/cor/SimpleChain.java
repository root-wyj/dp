package com.wyj.dp.cor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created
 * Author: wyj
 * Date: 2018/11/20
 */
public class SimpleChain implements Ratify.Chain {

    List<Ratify> ratifys;

    int index = 0;

    Request request;

    public SimpleChain(List<Ratify> ratifies, Request request) {
        this.ratifys = new ArrayList<>();
        this.ratifys.addAll(ratifies);
        this.request = request;
    }

    @Override
    public Result proceed(Request request) {
        this.request = request;
        int curIndex = index;
        if (curIndex < ratifys.size()) {
            index ++;
            return ratifys.get(curIndex).deal(this);
        }
        return null;
    }

    public void resetIndex() {
        this.index = 0;
    }

    @Override
    public Request getRequest() {
        return request;
    }
}
