package IfCondition;

import java.util.Scanner;

public class PostiveorNegtive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("check if the number is positive or negative");
        int number = sc.nextInt();
        if (number < 0)
            System.out.println(number + " is a negative number.");

        else if (number > 0)
            System.out.println(number + " is a positive number.");

        else
            System.out.println(number + " is 0.");
    }
}


