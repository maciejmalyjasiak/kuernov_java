package com.company;


    public class Kubelkowe implements Sortable {
    static int licznik = 0; //static int to zmienna przechowująca wartości całkowite, które są zadeklarowane jako static. Jeśli zadeklarujemy zmienną jako statyczną, istnieje ona do końca programu po jej zainicjowaniu.


        static void sort(int[] tab) {
            licznik=0;
            int[] tabk = new int[200];
            int okon1 =0; // zmie

            for (int i = 0; i < tab.length; i++) {
                if (tab[i] > okon1) {
                    okon1 = tab[i]; // szukam max
                }
            }
                int[] bucket = new int[okon1 + 1]; // -> robi kubełki o 1 wiecej niz max


            for (int i = 0; i < tab.length; i++)
            {
                bucket[tab[i]]++;
            }
            int pos = 0;
            for (int i = 0; i < bucket.length; i++)
            {
                for (int j = 0; j < bucket[i]; j++)
                {
                    tabk[pos++] = i;
                    licznik++;
                }
            }
            for (int i = 0; i < tabk.length; i++)
            {
               System.out.print(tabk[i] + " ");
            }
        }
            static void step_counting(){
            System.out.println(" \n Liczba krokow: " + licznik);
        }
    }

