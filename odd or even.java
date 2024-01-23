
// number is odd or even

import java.util.Scanner;
public class oddeven{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("Enter the no whic you want to cheak the no is odd or even : ");

        int a = input.nextInt();

        if(a%2==0){
            System.out.println("Your Number is Even");
        }
        else{
            System.out.println("Your Number is odd : ");
        }

    }
    
}
