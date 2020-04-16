package com.company;

public class Bubble implements Sortable {
static int licznik = 0;

    static void sort(int[] tab) {
        licznik=0;
        int okon; // zmienna tymczasowa
        int zmiana = 1;
        int[] tab2 = new int[200];

        for(int i = 0; i < tab.length - 1; i++)
        {
            tab2[i]=tab[i]; // zeby sortowac za kazdym razem, a nie podawac gotowej posortowanej tablicy
        }

        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab2[i] > tab2[i + 1]) {
                    okon = tab2[i + 1];
                    tab2[i + 1] = tab2[i];
                    tab2[i] = okon;
                   zmiana++;
                   licznik++;
                }
            }
        }
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + " ");
        }

    }


    static void step_counting() {
        System.out.println(" \n Liczba krokow: " + licznik);
    }

}






