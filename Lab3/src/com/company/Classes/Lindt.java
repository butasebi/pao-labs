package com.company.Classes;

import java.util.Objects;

public class Lindt extends CandyBox{
    int length;
    int width;
    int height;

    public Lindt() {
    }

    public Lindt(String flavor, String origin, int length, int width, int height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "The " + origin + " " + flavor + " has volume " + this.getVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lindt lindt = (Lindt) o;

        if(!super.equals(o))
            return false;

        return this.getVolume() == lindt.getVolume();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, width, height);
    }
}
