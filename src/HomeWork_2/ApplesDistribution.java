package HomeWork_2;
import java.util.Scanner;

public class ApplesDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество школьников (n): ");
        int n = scanner.nextInt();

        System.out.print("Введите количество яблок (k): ");
        int k = scanner.nextInt();

        int applesPerStudent = k / n;
        int remainingApples = k % n;

        System.out.println("Каждому школьнику достанется яблок: " + applesPerStudent);
        System.out.println("Останется в корзине яблок: " + remainingApples);

        scanner.close();
    }
}

