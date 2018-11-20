package com.wyj.dp.cor;

/**
 * 封装处理的结果
 * Created
 * Author: wyj
 * Date: 2018/11/20
 */
public class Result {

    private boolean isRatify;
    private String reason;

    public Result(){}

    public Result(boolean isRatify, String reason) {
        this.isRatify = isRatify;
        this.reason = reason;
    }

    public boolean isRatify() {
        return isRatify;
    }

    public void setRatify(boolean ratify) {
        isRatify = ratify;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "[Result]-->isRatify:"+isRatify+", reason:"+reason;
    }
}
