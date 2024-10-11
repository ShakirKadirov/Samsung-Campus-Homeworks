package HomeWork_4;
import java.util.Scanner;

public class SumOfDigitsCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите двузначное число n: ");
        int n = scanner.nextInt();

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        if (n < 10 || n > 99) {
            System.out.println("n должно быть двузначным числом.");
            return;
        }

        int sumOfDigits = (n / 10) + (n % 10);

        boolean isSumTwoDigit = (sumOfDigits >= 10 && sumOfDigits <= 99);
        System.out.println(isSumTwoDigit ? "YES" : "NO");

        boolean isSumGreaterThanA = (sumOfDigits > a);
        System.out.println(isSumGreaterThanA ? "YES" : "NO");

        scanner.close();
    }
}
