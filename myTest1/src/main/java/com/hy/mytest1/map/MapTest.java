package com.hy.mytest1.map;

import java.util.*;
import java.util.Map.Entry;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");
        map.put(4, "薛六");

        //使用keySet和加强for循环遍历
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            System.out.println("key:" + integer + ",value:" + map.get(integer));
        }

        System.out.println("---------------");

        //使用keySet和迭代器遍历
        Set<Integer> integers1 = map.keySet();
        Iterator<Integer> iterator = integers1.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("key:" + next + ",value:" + map.get(next));
        }

        System.out.println("---------------");

        //使用entrySet和加强for循环遍历
        Set<Entry<Integer, String>> entries = map.entrySet();
        for (Entry<Integer, String> entry : entries) {
            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }

        System.out.println("---------------");

        //使用entrySet和iterator迭代器遍历
        Set<Entry<Integer, String>> entries1 = map.entrySet();
        Iterator<Entry<Integer, String>> iterator1 = entries1.iterator();
        while (iterator1.hasNext()) {
            Entry<Integer, String> next = iterator1.next();
            System.out.println("key:" + next.getKey() + ",value:" + next.getValue());
        }

        List list = testEmptyList();
        System.out.println(list.size());

        List list1 = testSingletonList();
        System.out.println(list1);

        List<String> str = new ArrayList<>();
        str.add("shan1");
        str.add("shan2");
        str.add("shan3");
        List list2 = str.subList(0,2);
        for (Object o : list2) {
            System.out.println(o);
        }

        List<String> strings = Arrays.asList(null, "1", "2", "3");
        List<String> strings2 = null;
        if(strings2 != null) {
            str.addAll(strings2);
        }
        for (String s : str) {
            System.out.println(s);
        }

        List<String> generics = null;
        List notGenerics = new ArrayList(10);
        List notGenerics2 = new ArrayList(10);
        notGenerics2.add("xx");
        notGenerics2.add("bb");
        notGenerics2.add("hh");

        notGenerics.add(new Object());
        notGenerics.add(new Integer(1));
        notGenerics.add("hh");
        Integer count = 0;
        for (Object notGeneric : notGenerics) {
            if (notGeneric instanceof String) {
                count++;
            }
        }
        if(count == notGenerics2.size()) {
            generics = notGenerics;
        }
        for (String generic : generics) {
            System.out.println(generic);
        }
    }


    //emptyList 返回一个空集合 不能添加元素 但是不用开辟内存 减少内存空间使用
    private static List testEmptyList() {
        return Collections.emptyList();
    }

    //singleList 返回一个长度为1的集合 不能添加元素 但是不用开辟空间 减少内存空间使用
    private static List testSingletonList() {
        return Collections.singletonList("1");
    }

    //subList 返回集合的一部分 如果父集合添加或减少元素都用异常
    private static List testSubList(List list) {
        return list.subList(0,1);
    }
}
