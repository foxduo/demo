package com.duoduo.bean;

/**
 * Created by FOX_duo on 2018/12/29.
 */
public class User {
    private String msisdn;

    private String name;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "msisdn='" + msisdn + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
