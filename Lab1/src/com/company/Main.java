package com.company;

import com.sun.jdi.FloatValue;

import java.util.Scanner;

public class Main {

    static int factorial(int x)
    {
        if(x == 1)return 1;
        return factorial(x - 1) * x;
    }
    static int mult_3_5(int n)
    {
        int sum = 0;
        for(int i = 3; i <= n; i ++)
            if(i % 3 == 0 || i % 5 == 0)
            {
                sum += i;
            }
        return sum;
    }
    public static void main(String[] args) {
//        1. Scrieti un program care sa afișeze toate numerele pare din intervalul [0,n], unde n este un numar citit de la
//        tastatura.
//        Scanner scanner = new Scanner(System.in);
//        int i, n;
//        n = scanner.nextInt();
//        for(i = 0; i < n; i ++)
//            if(i % 2 == 0)
//            {
//                System.out.print(i + " ");
//            }
//        2. Scrieți un program care sa compare doua numere a și b citite de la tastatura si sa afiseze numarul mai
//        mare
//          Scanner scanner = new Scanner(System.in);
//          int x = scanner.nextInt();
//          int y = scanner.nextInt();
//          if(x > y)
//          {
//              System.out.println(x);
//          }
//          else
//          {
//              System.out.println(y);
//          }
//        3. Scrieți o metoda care sa calculeze factorialul unui numar n citit de la tastatura.
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        System.out.println(factorial(x));
//        4. Fiind dat un numar n, scrieti o metoda care insumeaza toti multiplii de 3 si 5 pana la n (inclusiv).
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println(mult_3_5(n));
//        5. Cititi de la tastatura n numere. Elementele citite vor fi organizate in doi vectori diferiti, in functie de
//        paritate (de ex: elementele pare in vectorul x, iar cele impare in vectorul y).
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int size1 = 0;
//        int size2 = 0;
//        int[] vec_pare = new int[10];
//        int[] vec_impare = new int[10];
//        for(int i = 1; i <= n; i ++)
//        {
//            int aux = scanner.nextInt();
//            if(aux % 2 == 0)
//            {
//                size1 += 1;
//                vec_pare[size1] = aux;
//            }
//            else
//            {
//                size2 += 1;
//                vec_impare[size2] = aux;
//            }
//        }
//        System.out.println("Elementele pare sunt:");
//        for(int i = 1; i <= size1; i ++)
//            System.out.print(vec_pare[i] + " ");
//        System.out.println("\nElementele impare sunt:");
//        for(int i = 1; i <= size2; i ++)
//            System.out.print(vec_impare[i] + " ");
//        6. Cititi de la tastatura n note, numere intregi, intr-un vector. Cand cititi valoarea -1 de la tastatura, citirea
//        notelor se opreste si programul afiseaza media acestora.
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int nr = 0;
//        while(true)
//        {
//            int x = scanner.nextInt();
//            if(x == -1)
//            {
//                System.out.println((float)sum / (float)nr);
//                break;
//            }
//            nr += 1;
//            sum += x;
//        }
    }
}
