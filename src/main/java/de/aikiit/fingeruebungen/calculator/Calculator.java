package de.aikiit.fingeruebungen.calculator;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws IOException {
        System.out.println("Willkommen beim Taschenrechner :)");
        String line = "";
        Scanner s = new Scanner(System.in);
        while ((line = s.nextLine()) != null) {


            System.out.println("> Enter subject: ");
            String subject = s.nextLine();

            if (subject.equals(("e"))) {
                break;
            }

            System.out.println("> Enter recipient: ");
            String recipient = s.nextLine();

            System.out.println("> Enter message: ");
            String message = s.nextLine();

            System.out.println("> " + message);

        }
    }
}
