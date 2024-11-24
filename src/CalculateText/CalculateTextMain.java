package CalculateText;

import java.util.Scanner;

public class CalculateTextMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculateText counter = new CalculateText();

        System.out.println("Skriv en text. För att avsluta skriv stop:");

        while (true) {
                String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            counter.addCharacters(input);
        }

        System.out.println("Totalt antal tecken: " + counter.getTotalCharacterCount());
        System.out.println("Totalt antal rader: " + counter.getTotalLineCount());

    }
}

