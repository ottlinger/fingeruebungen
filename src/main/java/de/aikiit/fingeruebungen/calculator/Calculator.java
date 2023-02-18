package de.aikiit.fingeruebungen.calculator;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {
        System.out.println("Willkommen bei unserem Taschenrechner :)");
        String line = "";
        Scanner s = new Scanner(System.in);
        while ((line = s.nextLine()) != null) {
            System.out.println("> Erste Zahl = ");
            String ersteZahl = s.nextLine();
            if (ersteZahl.equals(("e"))) {
                break;
            }

            System.out.println("> Zweite Zahl = ");
            String zweiteZahl = s.nextLine();

            System.out.println("==========================================");
            System.out.println("> " + new Addierer(ersteZahl, zweiteZahl).getSumme());

        }
    }
}
