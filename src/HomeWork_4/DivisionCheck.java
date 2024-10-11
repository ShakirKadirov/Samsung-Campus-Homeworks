package HomeWork_4;
import java.util.Scanner;

public class DivisionCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число m: ");
        int m = scanner.nextInt();
        System.out.print("Введите целое число n: ");
        int n = scanner.nextInt();

        if (n != 0) {
            if (m % n == 0) {
                int quotient = m / n;
                System.out.println("Частное от целочисленного деления m на n: " + quotient);
            } else {
                System.out.println("not completely divisible");
            }
        } else {
            System.out.println("Деление на ноль невозможно.");
        }

        scanner.close();
    }
}
