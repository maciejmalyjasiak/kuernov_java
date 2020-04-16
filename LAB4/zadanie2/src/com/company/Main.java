package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] tab = new String[6];
        tab[0] = "Adam Kowalski";
        tab[1] = "Paweł Okonski";
        tab[2] = "Kornel Banan";
        tab[3] = "Justyna Tulipan";
        tab[4] = "Barbara Trzmiel";
        tab[5]= "Jan Nowak";

        System.out.println("Wybierz numer pracownika: ");
        System.out.println(">>");
        int pracownik = scan.nextInt();

        try {
            System.out.println("Wybrany pracownik: " + tab[pracownik]);
        }
        catch(ArrayIndexOutOfBoundsException s){
            System.out.println("Przekroczyles zakres bazy danych!");

        }



    }
}
