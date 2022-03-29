package com.company;

import com.company.Models.*;
import org.w3c.dom.css.Counter;

import java.util.Collections;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        //1. Declarati o interfata Task care contine o metoda execute(), care returneaza void. Pe baza acestei interfete implementati 3 clase: RandomTask, OutTask si CounterOutTask.

        //a. Pentru OutTask afisati un mesaj in consola, mesaj specificat n constructor
        OutTask b = new OutTask("mesaj de afisat");
        b.execute();

        //b. Pentru RandomTask generati un numar aleator si afisati un mesaj cu el. Generarea se face in constructor
        RandomTask e = new RandomTask();
        e.execute();

        //c. Pentru CounterOutTask, incrementati un contor global si afisati-i valoarea dupa fiecare incrementare
        CounterOutClass c = new CounterOutClass();
        c.execute();
        CounterOutClass d = new CounterOutClass();
        d.execute();

        //Creati o noua clasa Container in care puteti adauga si elimina elemente.
        Container cont = new Container();
        cont.add_Task(b);
        cont.add_Task(c);
        cont.add_Task(d);
        cont.add_Task(e);

        System.out.println(cont.toString());

        //2. Declarati o clasa Album care are campurile: nume, artist, rating si anul publicarii.
        //a. Sortati un array de albume pe baza numelui, rating-ului si anului publicarii. Folositi ambele interfete de comparare.
        //b. Creati o clasa Main unde declarati array-ul si afisati-l inainte si dupa sortare
        Vector<Album> albums = new Vector<Album>();
        albums.add(new Album("The Marshall Mathers LP", "Eminem", 9.5, 2000));
        albums.add(new Album("Encore", "Eminem", 9.2, 2003));
        albums.add(new Album("Relapse", "Eminem", 8.9, 2009));

        Collections.sort(albums);

        System.out.println(albums.toString());

        //3. Creati 4 interfete Minus, Plus, Mult si Div care contin cate o metoda aferenta numelui si are ca argument un numar de tipul float.

        // Declarati o clasa Operation care sa le implementeze si care are un camp de tip float, modificat de metodele implementate de voi.

        Operation val = new Operation(5);
        val.OpPlus(3);
        val.OpMinus(1);
        val.OpDiv(3.5f);
        val.OpMult(2);
        System.out.println(val.getValue());
    }
}
