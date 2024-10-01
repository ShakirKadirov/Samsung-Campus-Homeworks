package HomeWork_2;
import java.util.Scanner;

public class TimeDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите время 1 (часы, минуты, секунды): ");
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        System.out.print("Введите время 2 (часы, минуты, секунды): ");
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int totalSeconds1 = hours1 * 3600 + minutes1 * 60 + seconds1;
        int totalSeconds2 = hours2 * 3600 + minutes2 * 60 + seconds2;

        int difference = totalSeconds2 - totalSeconds1;

        System.out.println(difference);

        scanner.close();
    }
}

