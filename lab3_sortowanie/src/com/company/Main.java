package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static boolean running = false;

    public static void main(String[] args) {
        running = true;
        Scanner in = new Scanner(System.in);
                                    //tab1 tab do posortowania
        int[] tab1 = new int[200];
        Random r = new Random(); // Stworzenie obiektu klasy Random, który posłuży do loswania liczb

        /*W przypadku zapisu r.nextInt(n); wylosowana zostanie liczba z
          zakresu od 0 do n-1
        */

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = r.nextInt(10); // Losowanie liczby z zakresu [0,9]
            System.out.println(tab1[i] +" ");
        }


        while(running) {
            System.out.print( "1.Sortowanie babelkowe" + "\n 2.Sortowanie kubelkowe \n");
            System.out.println(">>");
            int wejscie = in.nextInt();
            switch (wejscie) {

                case 1: {
                    Bubble.sort(tab1);
                    Bubble.step_counting();
                    break;
                }
                case 2: {
                    Kubelkowe.sort(tab1);
                    Kubelkowe.step_counting();
                    break;
                }
                default: {
                    System.out.println("Nie znaleziono takiej opcji");
                    break;
                }
            }
        }



    }
}