package HomeWork_3;
import java.util.Scanner;

public class SequenceCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Введите корректное трехзначное число.");
        } else {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int units = number % 10;

            boolean isIncreasing = (hundreds < tens) && (tens < units);
            boolean isDecreasing = (hundreds > tens) && (tens > units);

            if (isIncreasing) {
                System.out.println("Цифры данного числа образуют возрастающую последовательность.");
            } else if (isDecreasing) {
                System.out.println("Цифры данного числа образуют убывающую последовательность.");
            } else {
                System.out.println("Цифры данного числа не образуют ни возрастающую, ни убывающую последовательность.");
            }
        }

        scanner.close();
    }
}

