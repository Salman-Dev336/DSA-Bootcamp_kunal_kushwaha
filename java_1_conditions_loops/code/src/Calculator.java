import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // take input from user until user press X or x
        int answer = 0;

        while (true) {
            // taking operator from user
            System.out.println("Enter the Operator");
            char operator = in.next().trim().charAt(0);

            if (operator == '+' || operator == '-' || operator == '/' || operator == '%' ||
                    operator == '*') {

                // now take any two number from user

                System.out.println("Enter any two numbers ");

                int num1 = in.nextInt();
                int num2 = in.nextInt();
                // System.out.println();

                if (operator == '+') {
                    answer = num1 + num2;
                }
                if (operator == '-') {
                    answer = num1 - num2;
                }
                if (operator == '*') {
                    answer = num1 * num2;
                }
                if (operator == '/') {
                    if (num2 != 0) {
                        answer = num1 / num2;
                    }
                }
                if (operator == '%') {
                    answer = num1 % num2;
                }

            } else if (operator == 'X' || operator == 'x') {
                break;
            } else {
                System.out.println("inavlid operation! enter valid operator");
            }

        System.out.println("the answer is: " + answer);


        }

    }
}
