package DoWhileLoop;

public class EvenAndOddNumbers {
    public static void main(String[] args) {

        int i = 0;
      do {
            if (i % 2 == 0) {
                System.out.print("even: " + i);
            } else
                System.out.print("\nodd: " + i + "  ");
            i++;
        }  while (i < 30);
    }
}
    

