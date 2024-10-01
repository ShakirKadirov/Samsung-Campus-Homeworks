package HomeWork_1;

import java.util.Scanner;

public class FarmAnimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество курочек: ");
        int chickens = scanner.nextInt();

        System.out.print("Введите количество коров: ");
        int cows = scanner.nextInt();

        System.out.print("Введите количество свинок: ");
        int pigs = scanner.nextInt();

        int totalLegs = chickens * 2 + cows * 4 + pigs * 4;

        System.out.println("Общее количество ног у всех животных: " + totalLegs);

        scanner.close();
    }
}

