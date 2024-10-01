package HomeWork_3;
import java.util.Scanner;

public class RightTriangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стороны треугольника (a, b, c): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isRightTriangle = (a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a);

        System.out.println(isRightTriangle ? "Треугольник является прямоугольным." : "Треугольник не является прямоугольным.");

        scanner.close();
    }
}

