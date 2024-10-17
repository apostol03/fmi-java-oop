package task2;

import java.util.Scanner;

public class FiveDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 5-digit number: ");
        int number = scanner.nextInt();

        int originalNumber = number;

        if (number < 10000 || number > 99999) {
            System.out.println("The number you entered is not a 5-digit number!");
            return;
        }

        int digit1 = number / 10000;
        int digit2 = (number / 1000) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;

        boolean firstLastIdentical = digit1 == digit5;
        boolean secondFourthIdentical = digit2 == digit4;

        if (firstLastIdentical) {
            System.out.println("The first and last digits of the number you entered are identical");
        } else {
            System.out.println("The first and last digits of the number you entered are not identical");
        }

        if (secondFourthIdentical) {
            System.out.println("The second and fourth digits of the number you entered are identical");
        } else {
            System.out.println("The second and fourth digits of the number you entered are not identical");
        }

        String resultString;
        if (firstLastIdentical && secondFourthIdentical) {
            resultString = "The number you entered: " + originalNumber + " is a palindrome.";
        } else {
            resultString = "The number you entered: " + originalNumber + " is not a palindrome.";
        }

        System.out.println(resultString);

    }
}
