package com.wyj.dp.cor;

import com.wyj.dp.cor.ratifyImp.DepartmentHeader;
import com.wyj.dp.cor.ratifyImp.GroupLeader;
import com.wyj.dp.cor.ratifyImp.Manager;

import java.util.ArrayList;
import java.util.List;

/**
 * 一般的，责任链的建立非常的灵活，而且不需要让使用者知道，也就是说，操作者面向的是一个黑箱操作，
 * 他只需要将某个请求交给某个人，而整个黑箱内部是怎么处理传递的不需要暴漏出来。
 *
 * 所以，我们一般用一个工厂来构建责任链。
 *
 * Created
 * Author: wyj
 * Date: 2018/11/20
 */
public class SimpleChainFactory {

    public static Ratify.Chain getSimpleChain(Request request) {
        List<Ratify> ratifies = new ArrayList<>();
        ratifies.add(new GroupLeader());
        ratifies.add(new Manager());
        ratifies.add(new DepartmentHeader());

        return new SimpleChain(ratifies, request);
    }

}
