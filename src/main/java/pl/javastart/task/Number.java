package pl.javastart.task;

import java.util.Scanner;

public class Number {

    private static final int MIN_NUMBER = 100;
    private static final int MAX_NUMBER = 200;

    public void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Podaj liczbę");
            number = scanner.nextInt();

            if (number < MIN_NUMBER) {
                System.out.println("Podana liczba jest za mała.");
            } else if (number > MAX_NUMBER) {
                System.out.println("Podana liczba jest za duża.");
            } else if (number % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3.");

            }
        } while (number < MIN_NUMBER || number > MAX_NUMBER || number % 3 != 0);

        System.out.println("Twoja liczba jest ok");
    }
}
