package DoWhileLoop;

import java.util.Scanner;

public class SumOFDigits {
    public static void main(String args[]) {
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        do {

            digit = number % 10;

            sum = sum + digit;

            number = number / 10;

            System.out.println("Sum of Digits: " + sum);

        } while (number > 0);
    }
}
