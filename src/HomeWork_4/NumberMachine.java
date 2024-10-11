package HomeWork_4;
import java.util.Scanner;

public class NumberMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Ошибка: введите трехзначное число.");
        } else {
            int firstDigit = number / 100;
            int secondDigit = (number / 10) % 10;
            int thirdDigit = number % 10;

            int sum1 = firstDigit + secondDigit;
            int sum2 = secondDigit + thirdDigit;

            int maxSum = Math.max(sum1, sum2);
            int minSum = Math.min(sum1, sum2);

            String result = maxSum + "" + minSum;

            System.out.println("Результат: " + result);
        }

        scanner.close();
    }
}

