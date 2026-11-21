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

        // int number = 'a';
        // System.out.println(number); // will print the asci value of a 
        // which is 97 
        // and for capital A 
        //it is 65


        //java follows unicode 
        // System.out.println("你好");

        // System.out.println(3*6.90987);
        //automaticaly will promote into float 


        byte b = 45;
        char c = 'a';
        short s = 1024;
        int i =  50000;
        float f = 6.8746f;
        double d = 0.123455;

        double result = (f * b) + (i / c) - (d * s);

        System.out.println((f * b)+ " " + (i / c) + " "+ (d * s));
        // individual results 
        // all the smaller operants is converting to bigger operants e.g the byte is promoted to 
        // float similarly the character is promoted to integer and short is to double 


        System.out.println(result); // overall result


    





    }
}
