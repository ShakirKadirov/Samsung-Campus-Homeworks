package HomeWork_2;
import java.util.Scanner;

public class CakeCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стоимость торта (тенге и тиын): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("Введите количество тортов: ");
        int n = scanner.nextInt();

        int totalTiyn = (a * 100 + b) * n;

        int totalTenge = totalTiyn / 100;
        int remainingTiyn = totalTiyn % 100;

        System.out.println(totalTenge + " " + remainingTiyn);

        scanner.close();
    }
}
