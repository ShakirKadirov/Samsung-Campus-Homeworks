package HomeWork_4;
import java.util.Scanner;

public class ValidDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

        boolean isValidDate = false;

        if (month >= 1 && month <= 12) {
            int maxDays = 0;
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    maxDays = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    maxDays = 30;
                    break;
                case 2:
                    maxDays = isLeapYear ? 29 : 28;
                    break;
            }

            if (day >= 1 && day <= maxDays) {
                isValidDate = true;
            }
        }

        System.out.println(isValidDate);

        scanner.close();
    }
}
