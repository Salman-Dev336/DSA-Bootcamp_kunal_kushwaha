import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //     float num = input.nextFloat();
    //     System.out.println(num);


        //type casting
        // int num = (int)(67.00909f);// converting integer into float 
        // System.out.println(num);


        //automatic type promotion in expression

        // int a = 257;
        // byte b = (byte)(a);
        // System.out.println(b); // 257 % 256 = 1

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a * b) / c ;
        // System.out.println(d);


        // byte a =  50;
        // b= a * 2;   // not possible give an error because a is an integer 
        // need casting 

        int number = 'a';
        System.out.println(number); // will print the asci value of a 
        // which is 97 
        // and for capital A 
        //it is 65




    }
}
