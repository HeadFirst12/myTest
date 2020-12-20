package com.hy.mytest1.tomap;

public class Dog<T1,T2> {
    private T1 nameKey;

    private T2 nameValue;

    public T1 getNameKey() {
        return nameKey;
    }

    public void setNameKey(T1 nameKey) {
        this.nameKey = nameKey;
    }

    public T2 getNameValue() {
        return nameValue;
    }

    public void setNameValue(T2 nameValue) {
        this.nameValue = nameValue;
    }

    public Dog(T1 nameKey, T2 nameValue) {
        this.nameKey = nameKey;
        this.nameValue = nameValue;
    }
}
