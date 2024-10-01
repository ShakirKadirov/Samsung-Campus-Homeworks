package HomeWork_1;
import  java.util.Scanner;

public class TimeToSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество часов:");
        int hours = scanner.nextInt();

        System.out.println("Введите количество минут:");
        int minutes = scanner.nextInt();

        int totalSeconds = hours * 3600 + minutes * 60;
        System.out.println("Общее количество секунд: " + totalSeconds);
        scanner.close();
    }
}
