package HomeWork_2;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        int sum = hundreds + tens + units;

        System.out.println("Сумма цифр: " + sum);

        scanner.close();
    }
}

