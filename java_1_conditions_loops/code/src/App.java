import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*

        syntax of if statement
        if(boolean expression T or F){

        // do this 

        }
        else{
            do this 
        }
        
        
        */

        Scanner input = new Scanner(System.in);
        System.out.println("please entery your salary");
        double salary = input.nextFloat();

        if (salary>=20000) {
            salary = salary + (0.10 * salary);
        }
        else{
            salary = salary + (0.05 * salary);
        }

        System.out.println("your salary after adding bonus is : " + salary);


    }

}
