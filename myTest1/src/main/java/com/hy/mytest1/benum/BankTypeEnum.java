package com.hy.mytest1.benum;

public enum BankTypeEnum {
    ZJRCU_1("ZJRCU_1","001","农信1"),
    ZJRCU_2("ZJRCU_2","002","农信2"),
    ZJRCU_3("ZJRCU_3","003","农信3"),
    ZJRCU_4("ZJRCU_4","004","农信4"),
    ZJRCU_5("ZJRCU_5","005","农信5"),
    ZJRCU_6("ZJRCU_6","006","农信6");

    private String code;
    private String desc;
    private String name;

    private BankTypeEnum(String name,String code, String desc) {
        this.code = code;
        this.desc = desc;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }
}
