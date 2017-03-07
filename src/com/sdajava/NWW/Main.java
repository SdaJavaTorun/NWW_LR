package com.sdajava.NWW;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c, d ;

        System.out.println("Podaj pierwszą liczbę: ");
        Scanner in = new Scanner(System.in);
        c = in.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        d = in.nextInt();

         a = c;
         b = d;


        // System.out.println(a + "\t"+ b);

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b-  a;
        }
        System.out.println("NWD: " + a +"\n");

        System.out.println("NWW: " + (c/a)*d);




    }
}
