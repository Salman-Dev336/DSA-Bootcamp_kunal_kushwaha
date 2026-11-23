import java.util.Scanner;
public class Loops {

    public static void main(String[] args) {
        
        //loop
        //Question is print the numbers from 1 5 
        //Syntax 
        // if(initialization ; condition ; increment/decrement ){
        // do this 
        //}
        
        // for(int count = 1; count<=5; count++){
        //     System.out.println("count "+ count);
        // }

        // int count = 1;
        // while (count<=5) {
        //     System.out.println(count);
        //     count++;
        // }

        Scanner in = new Scanner(System.in);
        System.out.println("pleas enter any number");
        int n = in.nextInt();

        for (int num = 0; num <= n; num++) {
            System.out.println("Hello Salman");
            
        }
    }
    
}
