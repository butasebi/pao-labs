package com.company.Models;

public class OutTask implements Task {

    String mesaj;

    public OutTask(String mesaj) {
        this.mesaj = mesaj;
    }

    public String getMesaj() {
        return mesaj;
    }

    @Override
    public void execute()
    {
        System.out.println(mesaj);
    }
}
