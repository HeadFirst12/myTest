package com.hy.exception.test;

import org.junit.Test;

import java.beans.IntrospectionException;

public class MyTest {
    /**
     * 简单抛出一个异常
     */
    @Test
    public void test1() {
        System.out.println("数学计算之前");
        Object[] objects = {"a","b"};
        try {
            int i = Integer.parseInt(objects[0].toString());
            int j = Integer.parseInt(objects[1].toString());
            System.out.println("数学计算中" + i / j);
        } catch (ArithmeticException e) {
            System.out.println("0为被除数异常已经被处理了");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常已经被处理了");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("数字解析异常已经被处理了");
            e.printStackTrace();
        } finally {
            System.out.println("不管是否出现异常，都会执行");
        }
        System.out.println("数学计算之后");
    }

    @Test
    public void test2() {

    }
}
