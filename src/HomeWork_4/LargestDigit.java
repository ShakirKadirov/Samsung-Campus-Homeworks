package HomeWork_4;
import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        int largest = Math.max(hundreds, Math.max(tens, units));

        System.out.println("Наибольшая цифра в числе " + number + ": " + largest);

        scanner.close();
    }
}
