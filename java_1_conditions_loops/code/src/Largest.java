import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number one");
        int a = in.nextInt();
        System.out.println("Enter number two");
        int b = in.nextInt();
        System.out.println("Enter number three");
        int c = in.nextInt();

        //find the larget among these three numbers


        //first way of doing this 
        // int max = a;
        // if (b > max) {
        //     max = b;
        // }
        // if (c > max) {
        //     max = c;
        // }


        //another way of doing this 
        // int max = 0;
        // if (a > b) {
        //     max = a;
        // }
        // else{
        //     max = b;
        // }
        // if (c > max) {
        //     max = c;
        // }

        //thirsd way of doing this programm by using math.max method

        int max = Math.max(c, Math.max(a, b));
        
        System.out.println("the max number is: " + max);


    }
}
