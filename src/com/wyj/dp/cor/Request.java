package com.wyj.dp.cor;

/**
 * 封装请求
 * Created
 * Author: wyj
 * Date: 2018/11/20
 */
public class Request {

    private String name;
    private String reason;
    private int days;

    private String groupLeaderInfo;
    private String managerInfo;
    private String departmentInfo;

    private String customInfo;

    public Request(Builder builder){
        this.name = builder.name;
        this.reason = builder.reason;
        this.days = builder.days;
        this.groupLeaderInfo = builder.groupLeaderInfo;
        this.managerInfo = builder.managerInfo;
        this.departmentInfo = builder.departmentInfo;
        this.customInfo = builder.customInfo;
    }

    public Request(Request request) {
        this.name = request.name;
        this.reason = request.reason;
        this.days = request.days;
        this.groupLeaderInfo = request.groupLeaderInfo;
        this.managerInfo = request.managerInfo;
        this.departmentInfo = request.departmentInfo;
        this.customInfo = request.customInfo;
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }

    public int getDays() {
        return days;
    }

    public String getGroupLeaderInfo() {
        return groupLeaderInfo;
    }

    public String getManagerInfo() {
        return managerInfo;
    }

    public String getDepartmentInfo() {
        return departmentInfo;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setGroupLeaderInfo(String groupLeaderInfo) {
        this.groupLeaderInfo = groupLeaderInfo;
    }

    public void setManagerInfo(String managerInfo) {
        this.managerInfo = managerInfo;
    }

    public void setDepartmentInfo(String departmentInfo) {
        this.departmentInfo = departmentInfo;
    }

    public void setCustomInfo(String customInfo) {
        this.customInfo = customInfo;
    }

    public static class Builder {
        public String name;
        public String reason;
        public int days;

        public String groupLeaderInfo;
        public String managerInfo;
        public String departmentInfo;

        public String customInfo;

        public Builder() {}

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setDays(int days) {
            this.days = days;
            return this;
        }

        public Builder setGroupLeaderInfo(String groupLeaderInfo) {
            this.groupLeaderInfo = groupLeaderInfo;
            return this;
        }

        public Builder setManagerInfo(String managerInfo) {
            this.managerInfo = managerInfo;
            return this;
        }

        public Builder setDepartmentInfo(String departmentInfo) {
            this.departmentInfo = departmentInfo;
            return this;
        }

        public Builder setCustomInfo(String customInfo) {
            this.name = customInfo;
            return this;
        }

        public Request build() {
            return new Request(this);
        }

        public Builder newRequest(Request request) {
            this.name = request.name;
            this.reason = request.reason;
            this.days = request.days;
            this.groupLeaderInfo = request.groupLeaderInfo;
            this.managerInfo = request.managerInfo;
            this.departmentInfo = request.departmentInfo;
            this.customInfo = request.customInfo;
            return this;
        }

    }


    public String toString() {
        return "Request [name=" + name + ", reason=" + reason + ", days="
                + days + ",customInfo=" + customInfo + ", groupLeaderInfo="
                + groupLeaderInfo + ", managerInfo=" + managerInfo
                + ", departmentHeaderInfo=" + departmentInfo + "]";
    }

}
