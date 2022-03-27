package com.company.Classes;

public class Area {
    CandyBag area_bag;
    int number;
    String street;

    public Area() {
        area_bag = null;
        number = 0;
        street = "";
    }

    public Area(CandyBag area_bag, int number, String street) {
        this.area_bag = area_bag;
        this.number = number;
        this.street = street;
    }

    public void printAdress()
    {
        System.out.println(this.street);
        for(CandyBox box : this.area_bag.getBag())
        {
            if(box != null)System.out.println(box.toString());
        }

    }

    public CandyBag getArea_bag() {
        return area_bag;
    }

    public void setArea_bag(CandyBag area_bag) {
        this.area_bag = area_bag;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Area{" +
                "area_bag=" + area_bag +
                ", number=" + number +
                ", street='" + street + '\'' +
                '}';
    }
}
