package com.hy.mytest1.benum;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class TestEnum {

    @Test
    public void Test1() {
        for (BankTypeEnum value : BankTypeEnum.values()) {
            if(StringUtils.equals("ZJRCU_1",value.getName())) {
                System.out.println(value.getCode());
            }
        }
    }
}
