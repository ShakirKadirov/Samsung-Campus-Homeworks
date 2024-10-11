package HomeWork_4;
import java.util.Scanner;

public class GradeAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int totalStudents = A + B + C + D;
        int totalPoints = A * 5 + B * 4 + C * 3 + D * 2;
        double average = (double) totalPoints / totalStudents;

        int aboveAverage = 0;

        if (5 > average) {
            aboveAverage += A;
        }
        if (4 > average) {
            aboveAverage += B;
        }
        if (3 > average) {
            aboveAverage += C;
        }
        if (2 > average) {
            aboveAverage += D;
        }

        System.out.println(aboveAverage);

        scanner.close();
    }
}

