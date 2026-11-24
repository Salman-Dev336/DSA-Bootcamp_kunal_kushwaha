import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);



        // String word = "hello";
        // System.out.println(word.charAt(0));

        System.out.println("please enter any word");
        char ch = in.next().trim().charAt(0);


        //the question is to check it is lower 
        //or upper case 
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("the first alphabet is lowercase");
        }
        else{
            System.out.println("the first alphabet of your word is upper case ");
        }
        System.out.println("your first alphabet is " + ch);



    }
}
