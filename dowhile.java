
// This is the Basicaly do while loop Syntax only.

import java.util.Scanner;

public class dowhile {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    do {
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        if(num%10==0){
            break;
        }
        System.out.println(num);

    }while(true);
    }
}
