 /* [1] Addition of two number by taking input from user */


import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Addition of two numbers");
        System.out.println("Enter your first number: ");

        int firstNum = input.nextInt();

        System.out.println("Enter your second number: ");

        int secondNum = input.nextInt();

        int sum = firstNum + secondNum;
        
        System.out.println(sum);
    }
}
