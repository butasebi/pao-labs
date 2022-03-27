package com.company.Classes;

import java.util.Arrays;

public class CandyBag {
    CandyBox [] bag;

    public CandyBag() {
        bag = null;
    }

    public CandyBag(CandyBox[] bag) {
        this.bag = bag;
    }

    public CandyBox[] getBag() {
        return bag;
    }

    public void setBag(CandyBox[] bag) {
        this.bag = bag;
    }

    @Override
    public String toString() {
        return "CandyBag{" +
                "bag=" + Arrays.toString(bag) +
                '}';
    }
}
