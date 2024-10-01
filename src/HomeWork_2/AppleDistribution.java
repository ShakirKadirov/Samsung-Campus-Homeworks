package HomeWork_2;
import java.util.Scanner;

public class AppleDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество школьников (n) и яблок (k): ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int remainingApples = k % n;
        int studentsWithLessApples = (remainingApples > 0) ? remainingApples : 0;

        System.out.println(studentsWithLessApples);

        scanner.close();
    }
}

