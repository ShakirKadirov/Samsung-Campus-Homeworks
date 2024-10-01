package HomeWork_2;
import java.util.Scanner;

public class DigitalClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество секунд с начала суток: ");
        int n = scanner.nextInt();

        int totalSecondsInDay = 24 * 60 * 60;

        n = n % totalSecondsInDay;

        int hours = n / 3600;
        int minutes = (n % 3600) / 60;
        int seconds = n % 60;

        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);

        scanner.close();
    }
}
