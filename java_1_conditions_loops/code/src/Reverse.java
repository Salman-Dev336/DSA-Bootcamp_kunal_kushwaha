import java.util.Scanner;

public class Reverse {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("plx enter any number to reverse ");
        int num = in.nextInt();

       int reverse = 0;

       while ( num > 0) {
        int remainder = num % 10;
        num = num/10;

        reverse = reverse *10 + remainder;
       }

       System.out.println("the reverse is: " +reverse);
    }
}
