package task3;

import java.util.Scanner;

public class IntegerDecryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 4-digit integer to decrypt: ");

        int number = scanner.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("The number you entered is not a 4-digit integer!");
            return;
        }

        int digit1 = number / 1000;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;

        int digit1D = (digit1 + 10 - 7) % 10;
        int digit2D = (digit2 + 10 - 7) % 10;
        int digit3D = (digit3 + 10 - 7) % 10;
        int digit4D = (digit4 + 10 - 7) % 10;

        int decryptedNumber = digit3D * 1000 + digit4D * 100 + digit1D * 10 + digit2D;

        System.out.println("Decrypted number: " + decryptedNumber);
    }

}
