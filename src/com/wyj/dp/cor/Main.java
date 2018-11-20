package com.wyj.dp.cor;

import com.wyj.dp.cor.ratifyImp.DepartmentHeader;
import com.wyj.dp.cor.ratifyImp.GroupLeader;
import com.wyj.dp.cor.ratifyImp.Manager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created
 * Author: wyj
 * Date: 2018/11/20
 */
public class Main {

    public static void main(String[] args) {
        List<Ratify> ratifies = new ArrayList<>();
        ratifies.add(new GroupLeader());
        ratifies.add(new Manager());
        ratifies.add(new DepartmentHeader());

        Request request = new Request.Builder()
                .setName("小明")
                .setDays(10)
                .setReason("常回家看看")
                .build();

        SimpleChain chain = new SimpleChain(ratifies, request);
        Result result = chain.proceed(request);

        System.out.println("result:"+result);
        System.out.println("request:"+request);
    }
}
