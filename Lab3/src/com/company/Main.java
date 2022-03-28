package com.company;

import com.company.Classes.*;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //1. Proiectati o clasa CandyBox, care va continue campurile: flavor (String), origin (String) cu modificatorii de access corespunzatori.
        // Clasa va avea de asemenea:

        //a. Constructor fara parametri
        //b. Constructor care va initializa toate campurile
        //c. O metoda abstracta getVolume()
        //d. Suprascrierea metodei toString()

        CandyBox test = new CandyBox("Caramel", "Thailand");

        System.out.println(test.toString());
        //Din ea derivati clasele Merci, Lindt, Milka. Pentru un design diferit, cutiile au diverse forme:
        //a. Lindt va contine length, width si height
        //b. Milka va fi un cilindru cu campurile radius si height
        //c. Merci va fi un cub si va contine campul length

        //Clasele vor avea de asemenea:
        //a. Constructor fara parametri
        //b. Constructor care initializeaza membrii claselor
        //c. Suprascrierea metodei getVolume()
        //d. Suprascrierea metodei toString() care sa returneze un mesaj de genul: “The ” + origin + “ “ + flavor + “ has volume “ + volume.

        Milka milk1 = new Milka("Caramel", "Thailand", 5, 10);
        System.out.println(milk1.toString());

        //Verificati egalitatea acestor obiecte create (din fiecare tip) si adaugati metoda equals() dupa cum este nevoie.
        // Justificati criteriul de echivalenta ales.

        //Criteria: We consider that two candyboxes are equal if they have the same origin, flavor and volume

        Milka milk2 = new Milka(test.getFlavor(), test.getOrigin(), 5, 10);

        System.out.println(milk1.equals(milk2));

        //Creati o clasa CandyBag care va contine un array cu cutii din fiecare tip.

        CandyBag candy_bag = new CandyBag();

        //Creati clasa Area care va continue un obiect de tip CandyBag, un camp number (int) si unul street (String). Clasa va contine:
        //a. Constructor fara parametri
        //b. Constructor care initializeaza atributele
        //c. O metoda printAddress() care va afisa adresa completa si continutul CandyBag (parcurgeti array-ul si apelati metoda toString() pentru elementele sale)

        CandyBag a_bag = new CandyBag();
        int n = 5;
        CandyBox [] aux = new CandyBox[n + 1];

        //data generation
        for(int i = 0; i < n; i ++)
        {
            if(i % 3 == 0)
                aux[i] = new Lindt("India", "Mentol", 5 + i, 5 + i, 10 + i);
            if(i % 3 == 1)
                aux[i] = new Milka("India", "Mentol", 5 + i, 10 + i);
            if(i % 3 == 2)
                aux[i] = new Merci("India", "Mentol", 5 + i);
        }

        a_bag.setBag(aux);

        Area a = new Area();
        a.setNumber(5);
        a.setStreet("1445 West Norwood Avenue in Itasca, Illinois");
        a.setArea_bag(a_bag);
        System.out.println(a.toString());

        System.out.println();

        a.printAdress();

        //2. Se citeste un sir de caractere de la tastatura, verificati daca este un palindrom.
        Scanner scanner = new Scanner(System.in);
        /*
        String x = scanner.nextLine();

        //we assign to string y the string x so we can build a string in x with the size equal to size of y
        String y = "";
        System.out.println(x);

        for(int i = x.length() - 1; i >= 0; i --)
        {
            y = y + x.charAt(i);
        }

        if(y.equals(x))
            System.out.println("Sirul " + x + " este palindrom!");
        else
            System.out.println("Sirul " + x + " nu este palindrom!");

        //3. Scrieti un program care verifica daca doua siruri de caractere sunt anagrame. (ex: ramo, mora si roma sunt anagrame)

        String sir = scanner.nextLine();
        String [] words = sir.split(" ");
        if(words.length != 2)
            System.out.println("Numar de parametri gresit!");
        else
        {
            int [] vector_frecv = new int[135]; //vector de frecventa al caracterelor pe ascii code 97-121

            for(int i = 97; i <= 122; i ++)
                vector_frecv[i] = 0;

            for(int i = 0; i < words[0].length(); i ++)
                vector_frecv[(int)words[0].charAt(i)] = vector_frecv[(int)words[0].charAt(i)] + 1;

            for(int i = 0; i < words[1].length(); i ++)
                vector_frecv[(int)words[1].charAt(i)] = vector_frecv[(int)words[1].charAt(i)] - 1;

            Boolean ok = true;

            for(int i = 97; i <= 122; i ++)
                if(vector_frecv[i] != 0)
                {
                    System.out.println("Nu sunt anagrame!");
                    ok = false;
                    break;
                }
            if(ok == true)
                System.out.println("Sunt anagrame");
        }

        */

        //Singleton function: get_object
        PasswordMarker x = PasswordMarker.get_object("gigel");
        
        //System.out.println("Stantza" + 5);
        System.out.println(x.getPassword());
    }
}
