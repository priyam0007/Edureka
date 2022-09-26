package DoWhileLoop;

import java.util.Scanner;

public class GenerateTables {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int num = sc.nextInt();
        System.out.print("Enter range: ");

        int range = sc.nextInt();
        int i = 1;

        do {

            System.out.println(num + " * " + i + " = " + num * i);

            i++;
        }while (i <= range);
    }
    
}
