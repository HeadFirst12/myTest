package com.hy.mytest1.tomap;

import java.util.ArrayList;
import java.util.List;

public class ToMapTest {

    public static void main(String[] args) {
        List<Dog<String, Double>> dogList = new ArrayList<>(2);
        dogList.add(new Dog<String, Double>("name", 1.14));
        dogList.add(new Dog<String, Double>("name", 3.14));
        for (Dog<String, Double> stringDoubleDog : dogList) {
            System.out.println(stringDoubleDog.getNameKey() + "=" + stringDoubleDog.getNameValue());
        }
    }
}
