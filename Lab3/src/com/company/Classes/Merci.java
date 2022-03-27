package com.company.Classes;

import java.util.Objects;

public class Merci extends CandyBox{
    int length;

    public Merci() {
    }

    public Merci(String flavor, String origin, int length) {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public double getVolume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return "The " + origin + " " + flavor + " has volume " + this.getVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Merci merci = (Merci) o;

        if(!super.equals(o))
            return false;

        return this.getVolume() == merci.getVolume();
    }

    @Override
    public int hashCode() {
        return length;
    }
}
