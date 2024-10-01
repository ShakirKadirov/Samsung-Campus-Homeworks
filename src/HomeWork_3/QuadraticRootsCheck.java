package HomeWork_3;
import java.util.Scanner;

public class QuadraticRootsCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значения A, B и C (A не равно 0): ");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        if (A == 0) {
            System.out.println("Число A не должно быть равно 0.");
        } else {
            double D = B * B - 4 * A * C;
            boolean hasRealRoots = D >= 0;

            System.out.println(hasRealRoots ? "Квадратное уравнение имеет вещественные корни." : "Квадратное уравнение не имеет вещественных корней.");
        }

        scanner.close();
    }
}

