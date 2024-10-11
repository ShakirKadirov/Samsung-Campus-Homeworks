package HomeWork_4;
import java.util.Scanner;

public class TravelDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int days = m / n;
        if (m % n != 0) {
            days++;
        }

        System.out.println(days);

        scanner.close();
    }
}
