package HomeWork_2;
import java.util.Scanner;

public class TimeFromMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество минут с начала суток: ");
        int n = scanner.nextInt();
        int totalMinutesInDay = 24 * 60;

        n = n % totalMinutesInDay;
        int hours = n / 60;
        int minutes = n % 60;

        System.out.println(hours + " " + minutes);

        scanner.close();
    }
}
