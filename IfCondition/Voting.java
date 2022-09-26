package IfCondition;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("check if a candidate is eligible for voting or not");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("candidate is eligible for voting");
        } else {
            System.out.println("candidate is not eligible for voting");
        }
    }
}

