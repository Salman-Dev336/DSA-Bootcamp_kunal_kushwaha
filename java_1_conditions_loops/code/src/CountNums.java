import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int count = 0;
        while (num > 0) {
            int remainder = num % 10;

            if (remainder == 5) {
                
                count++;
            }
            num = num / 10; //or num/ = 10;

        }

        System.out.println("the count of 5 int the given number is: " + count);
    }
}
