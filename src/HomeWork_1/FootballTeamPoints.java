package HomeWork_1;
import java.util.Scanner;


public class FootballTeamPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество побед: ");
        int victories = scanner.nextInt();

        System.out.print("Введите количество ничьих: ");
        int draws = scanner.nextInt();

        System.out.print("Введите количество поражений: ");
        int losses = scanner.nextInt();

        int totalPoints = victories * 3 + draws;
        int totalMatches = victories + draws + losses;

        double averagePoints = 0;
        if (totalMatches > 0) {
            averagePoints = (double) totalPoints / totalMatches;
        }

        System.out.println("Общее количество очков: " + totalPoints);
        System.out.printf("Среднее количество очков за матч: %.2f%n", averagePoints);

        scanner.close();
    }
}


