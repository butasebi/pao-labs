package com.company.Models;

import java.util.Random;

public class RandomTask implements Task {
    int nr_random;

    public int getNr_random() {
        return nr_random;
    }

    public RandomTask() {
        Random nr_rand = new Random();
        this.nr_random = nr_rand.nextInt();
    }

    @Override
    public void execute() {
        System.out.println(nr_random);
    }
}
