package com.wyj.dp.cor.ratifyImp;

import com.wyj.dp.cor.Ratify;
import com.wyj.dp.cor.Request;
import com.wyj.dp.cor.Result;

/**
 * Created
 * Author: wyj
 * Date: 2018/11/20
 */
public class DepartmentHeader implements Ratify {

    @Override
    public Result deal(Chain chain) {
        Request request = chain.getRequest();
        boolean isRatify;
        String msg;
        if (request.getDays() <= 7) {
            isRatify = true;
            msg = "不要着急，把事情处理完再回来！";
        } else {
            isRatify = false;
            msg = "你这个完全没必要";

        }

        request.setDepartmentInfo(msg);
        return new Result(isRatify, "DepartmentHeader："+msg);
    }
}
