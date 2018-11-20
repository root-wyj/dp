package com.wyj.dp.cor.ratifyImp;

import com.wyj.dp.cor.Ratify;
import com.wyj.dp.cor.Request;
import com.wyj.dp.cor.Result;

/**
 * Created
 * Author: wyj
 * Date: 2018/11/20
 */
public class Manager implements Ratify{

    @Override
    public Result deal(Chain chain) {
        Request request = chain.getRequest();
        if (request.getDays() <= 4) {
            String msg = "早点把事情办完，项目离不开你";
            request.setManagerInfo(msg);
            return new Result(true, "Manager："+msg);
        }

        request.setManagerInfo(request.getName() + "每月的KPI考核还不错，可以批准");
        return chain.proceed(request);
    }
}
