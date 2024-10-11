package HomeWork_4;
import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Большее число: " + firstNumber);
        } else {
            System.out.println("Большее число: " + secondNumber);
        }
    }
}