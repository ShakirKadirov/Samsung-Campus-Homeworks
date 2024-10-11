package HomeWork_4;
import java.util.Scanner;

public class SignCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("-");
        } else {
            System.out.println("+");
        }

        scanner.close();
    }
}

