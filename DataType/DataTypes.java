package DataType;

public class DataTypes {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = b/a;
        float remainder = b%a;


        System.out.println("sum of 10 and 20 is: " + sum);
        System.out.println("sub of 10 and 20 is: " + sub);
        System.out.println("mul of 10 and 20 is: " + mul);
        System.out.println("div of 20 and 10 is: " + div);
        System.out.println("remainder of 34 and 12 is: " + remainder);


        int x = 10;
        b = x++;
        System.out.println("The value of b is: " + b);
        System.out.println("The value of y is: " + x);
        b = ++x;
        System.out.println("The value of b is: " + b);
        System.out.println("The value of y is: " + x);

        int y = 10;
        b = y--;
        System.out.println("The value of b is: " + b);
        System.out.println("The value of y is: " + y);
        b = --y;
        System.out.println("The value of b is: " + b);
        System.out.println("The value of y is: " + y);


    }
}
    

