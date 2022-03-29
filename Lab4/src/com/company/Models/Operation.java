package com.company.Models;

public class Operation implements Plus, Minus, Div, Mult{
    float value;
    @Override
    public void OpDiv(float x){
        if(x != 0)
            this.value = this.value / x;
    }

    public Operation() {
        this.value = 0;
    }

    public float getValue() {
        return value;
    }

    public Operation(float value) {
        this.value = value;
    }

    @Override
    public void OpMinus(float x) {
        this.value = this.value - x;

    }

    @Override
    public void OpMult(float x) {
        this.value = this.value * x;
    }

    @Override
    public void OpPlus(float x) {
        this.value = this.value + x;
    }
}
