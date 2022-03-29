package com.company.Models;

import org.w3c.dom.css.Counter;

import java.util.Vector;

public class Container {
    Vector<Task> lista;

    public Container() {
        lista = new Vector<Task>();
    }

    @Override
    public String toString() {
        return "Container{" +
                "lista=" + lista +
                '}';
    }

    public void add_Task(Task alpha)
    {
        lista.add(alpha);
    }

}
