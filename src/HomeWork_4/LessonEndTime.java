package HomeWork_4;
import java.util.Scanner;

public class LessonEndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lessonNumber = scanner.nextInt();

        int startHour = 9;
        int startMinute = 0;
        int lessonDuration = 45;
        int breakDurationShort = 5;
        int breakDurationLong = 15;

        int totalMinutes = startHour * 60 + startMinute;

        for (int i = 1; i < lessonNumber; i++) {
            totalMinutes += lessonDuration;
            if (i % 2 == 1) {
                totalMinutes += breakDurationShort;
            } else {
                totalMinutes += breakDurationLong;
            }
        }

        int endHour = totalMinutes / 60;
        int endMinute = totalMinutes % 60;

        System.out.println(endHour + " " + endMinute);

        scanner.close();
    }
}

