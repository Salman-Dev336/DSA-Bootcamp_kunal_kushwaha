import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("find fibonnaci of any number ");
        int num = in.nextInt();

        int previousFib = 0;
        int currentFib = 1;

        int count = 2;

        while (count <= num) {
            int temp = currentFib;
            currentFib = currentFib + previousFib;
            previousFib = temp;
            count++;

        }
        System.out.println("the fibonnaci of " + num +  " is " + currentFib);

    }
}
