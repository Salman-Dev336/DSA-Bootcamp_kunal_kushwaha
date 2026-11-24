import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {

        //this programm is to find fibonacci
        //  of any number enter by the user 

        
        Scanner in = new Scanner(System.in);
        System.out.println("find fibonnaci of any number ");
        int num = in.nextInt();

        int prviousfib = 0;
        int currentfib = 1;
        int count = 2;

        while (count <= num) {
            
            int temp = currentfib;
            currentfib = currentfib + prviousfib;
            prviousfib = temp;
            count++;
        }

        System.out.println("the fibonnaci of " + num +" is: " + currentfib );

    }
}
