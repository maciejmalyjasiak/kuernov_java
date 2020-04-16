package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Ile masz wzrostu w cm?");
            System.out.println(">>");
            String numer = scan.nextLine();
            Integer.parseInt(numer);
            System.out.println("Masz "  + numer+ " centymetrow wzrostu");
        }
            catch(NumberFormatException e) {
                System.out.println("Wymagany format liczbowy");
        }

    }
}
