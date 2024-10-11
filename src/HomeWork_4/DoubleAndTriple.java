package HomeWork_4;
import java.util.Scanner;

public class DoubleAndTriple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        int smaller = Math.min(a, b);
        int larger = Math.max(a, b);

        smaller *= 2;
        larger *= 3;

        System.out.println("Результат удвоения меньшего числа: " + smaller);
        System.out.println("Результат утроения большего числа: " + larger);

        scanner.close();
    }
}

