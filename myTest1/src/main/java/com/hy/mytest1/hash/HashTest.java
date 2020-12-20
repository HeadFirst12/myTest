package com.hy.mytest1.hash;

public class HashTest {

    public static void main(String[] args) {
        Person p1 = new Person("heyin",21);
        Person p2 = new Person("heyin",21);
        System.out.println(p1.equals(p2));
        System.out.println("p1="+p1.hashCode());
        System.out.println("p2="+p2.hashCode());
    }
}
