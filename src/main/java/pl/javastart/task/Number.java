package pl.javastart.task;

import java.util.Scanner;

public class Number {

    public void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int minNumber = 100;
        int maxNumber = 200;
        do {
            System.out.println("Podaj liczbę");
            number = scanner.nextInt();

            if (number < minNumber) {
                System.out.println("Podana liczba jest za mała.");
            } else if (number > maxNumber) {
                System.out.println("Podana liczba jest za duża.");
            } else if (number % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3.");

            }
        } while (number < minNumber || number > maxNumber || number % 3 != 0);

        System.out.println("Twoja liczba jest ok");
        scanner.close();
    }
}
