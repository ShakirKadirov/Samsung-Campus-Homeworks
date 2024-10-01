package HomeWork_3;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите четырехзначное число: ");
        int number = scanner.nextInt();

        String numberStr = String.valueOf(number);

        if (numberStr.length() != 4) {
            System.out.println("Введите корректное четырехзначное число.");
        } else {
            String reversedStr = new StringBuilder(numberStr).reverse().toString();

            boolean isPalindrome = numberStr.equals(reversedStr);
            System.out.println(isPalindrome ? "Данное число читается одинаково слева направо и справа налево." : "Данное число не читается одинаково слева направо и справа налево.");
        }

        scanner.close();
    }
}
