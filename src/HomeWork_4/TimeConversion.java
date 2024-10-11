package HomeWork_4;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String formattedTime = String.format("%02d:%02d", hours, remainingMinutes);

        if (hours >= 9 && hours < 18) {
            System.out.println(formattedTime + " - working time");
        } else {
            System.out.println(formattedTime + " - free time");
        }

        scanner.close();
    }
}
