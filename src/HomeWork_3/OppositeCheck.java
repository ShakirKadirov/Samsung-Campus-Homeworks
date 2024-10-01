package HomeWork_3;
import java.util.Scanner;

public class OppositeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите три целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean hasOpposite = (a == -b) || (a == -c) || (b == -c);
        System.out.println(hasOpposite ? "Есть хотя бы одна пара взаимно противоположных чисел." : "Взаимно противоположных пар нет.");

        scanner.close();
    }
}

