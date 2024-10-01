package HomeWork_1;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите сторону b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите сторону c: ");
        double c = scanner.nextDouble();

        double semiPerimeter = (a + b + c) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

        System.out.println("Площадь треугольника: " + area);

        scanner.close();
    }
}
