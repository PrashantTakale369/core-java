import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int marks[]=new int[100];

        marks[0]=input.nextInt(); //phy
        marks[1]=input.nextInt(); //chem
        marks[2]=input.nextInt(); //math

        System.out.println("phy  : "+ marks[0]);
        System.out.println("chem : "+ marks[1]);
        System.out.println("math : "+ marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println(+percentage+"%");
        System.out.println(marks.length );
       
    }
}
