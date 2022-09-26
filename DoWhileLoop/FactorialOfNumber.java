package DoWhileLoop;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int fact = 1;
        int i = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number factorial ");
        int num = sc.nextInt();

        do {
            fact = fact * i;
            i++;
            System.out.println("\nFactorial of " + num + " is: " + fact);
        } while (i <= num);

    }
}