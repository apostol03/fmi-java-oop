package task3;

import java.util.Scanner;

public class IntegerEncryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 4-digit integer to encrypt: ");

        int num = scanner.nextInt();

        if (num < 1000 || num > 9999) {
            System.out.println("The number you entered is not a 4-digit integer!");
            return;
        }

        int digit1 = num / 1000;
        int digit2 = (num / 100) % 10;
        int digit3 = (num / 10) % 10;
        int digit4 = num % 10;

        int digit1E = (digit1 + 7) % 10;
        int digit2E = (digit2 + 7) % 10;
        int digit3E = (digit3 + 7) % 10;
        int digit4E = (digit4 + 7) % 10;

        int encryptedNum = digit3E * 1000 + digit4E * 100 + digit1E * 10 + digit2E;

        System.out.println("Encrypted number: " + encryptedNum);
    }

}
