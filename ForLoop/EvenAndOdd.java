package ForLoop;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter All Even and Odd numbers");
        int number = sc.nextInt();
        System.out.println("Even numbers from 1 to " + number + " are: \n");
        for (a = 1; a <= number; a++) {
           if (a % 2 == 0) {
              System.out.print(a + "\n");
           }
        }
        System.out.println("Odd numbers from 1 to " + number + " are: \n");
        for (a = 1; a <= number; a++) {
           if (a % 2 == 1) {
              System.out.print(a + "\n");
           }
        }
     }
  }
  
    

