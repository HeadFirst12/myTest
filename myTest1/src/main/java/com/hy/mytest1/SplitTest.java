package com.hy.mytest1;

public class SplitTest {

    public static void main(String[] args) {
        String str = "12,13,14,15,,,,";
        String[] split = str.split(",");
        int sp = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ',') {
                sp++;
            }
        }
        int resultLen = sp - split.length;
        for (String s : split) {
            System.out.println(s);
        }
        if (resultLen > 0) {
            for (int i = 0; i < resultLen; i++) {
                System.out.println("null");
            }
        }
    }
}
