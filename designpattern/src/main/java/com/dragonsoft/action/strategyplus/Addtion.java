package com.dragonsoft.action.strategyplus;

public class Addtion<T extends Number> implements ICalucatorStrategy<T> {
    @Override
    public Number calucate(T a, T b) {
        return a.doubleValue()+b.doubleValue();
    }
}
