package HomeWork_1;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество минут: ");
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println("Полных часов: " + hours);
        System.out.println("Оставшихся минут: " + remainingMinutes);

        scanner.close();
    }
}

