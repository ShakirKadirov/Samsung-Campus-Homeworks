package HomeWork_4;
import java.util.Scanner;

public class AppleDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int applesPerStudent = k / n;
        int remainder = k % n;

        int studentsWithLessApples = n - remainder;

        System.out.println(studentsWithLessApples);

        scanner.close();
    }
}

