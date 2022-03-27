package com.company.Classes;

import java.util.Objects;

public class Milka extends CandyBox{
    int radius;
    int height;

    public Milka() {
    }

    public Milka(String flavor, String origin, int radius, int height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return 3.14 * radius * radius * height;
    }

    @Override
    public String toString() {
        return "The " + origin + " " + flavor + " has volume " + this.getVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Milka milka = (Milka) o;

        if(!super.equals(o))
            return false;

        return this.getVolume() == milka.getVolume();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius, height);
    }
}
