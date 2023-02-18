package de.aikiit.fingeruebungen.calculator;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {
        System.out.println("Willkommen bei unserem Taschenrechner :) (e = Ende)");
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("> Erste Zahl = ");
            String ersteZahl = s.nextLine();

            System.out.println("> Zweite Zahl = ");
            String zweiteZahl = s.nextLine();

            if (ersteZahl.equals("e") || zweiteZahl.equals("e")) {
                System.out.println("Tschüßikowski");
                break;
            }

            System.out.println("==========================================");
            System.out.println("> " + ersteZahl + " + " + zweiteZahl + " = " + new Addierer(ersteZahl, zweiteZahl).getSumme());

        }
    }
}
