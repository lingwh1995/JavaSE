package com.dragonsoft.action.strategy;

public class Addtion implements ICalucatorStrategy {
    @Override
    public Integer calucate(int a, int b) {
        return a+b;
    }
}
