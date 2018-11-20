package com.wyj.dp.cor.ratifyImp;

import com.wyj.dp.cor.Ratify;
import com.wyj.dp.cor.Request;
import com.wyj.dp.cor.Result;

/**
 * Created
 * Author: wyj
 * Date: 2018/11/20
 */
public class GroupLeader implements Ratify{

    @Override
    public Result deal(Chain chain) {
        Request request = chain.getRequest();
        if (request.getDays() <= 2) {
            String msg = "早去早回";
            request.setGroupLeaderInfo(msg);
            return new Result(true, "GroupLeader: "+msg);
        }

        request.setGroupLeaderInfo(request.getName() + "平时表现不错，而且现在项目也不忙");

        return chain.proceed(request);
    }
}
