package WhileLoop; 

public class EvenAndOdd {
    public static void main(String[] args) {

        int i = 0;
        while (i < 30) {
            if (i % 2 == 0) {
                System.out.print("even: " + i);
            } else
                System.out.print("\nodd: " + i + "  ");
            i++;
        }
    }
}
