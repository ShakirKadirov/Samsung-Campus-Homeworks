package HomeWork_4;
import java.util.Scanner;

public class SnailClimb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= h) {
            System.out.println(1);
        } else {
            int progressPerDay = a - b;
            int daysToReachTop = (h - a) / progressPerDay;

            if ((h - a) % progressPerDay != 0) {
                daysToReachTop++;
            }
            System.out.println(daysToReachTop + 1);
        }

        scanner.close();
    }
}
