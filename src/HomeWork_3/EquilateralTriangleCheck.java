package HomeWork_3;
import java.util.Scanner;

public class EquilateralTriangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стороны треугольника (a, b, c): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean isEquilateralTriangle = (a == b) && (b == c);

        System.out.println(isEquilateralTriangle ? "Треугольник является равносторонним." : "Треугольник не является равносторонним.");

        scanner.close();
    }
}

