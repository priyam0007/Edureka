package IfCondition;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int numberOne, numberTwo, largest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        numberOne = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        numberTwo = sc.nextInt();

        if (numberOne > numberTwo)
            largest = numberOne;
        else
            largest = numberTwo;

        System.out.println("\nLargest = " + largest);
    }
}

    

