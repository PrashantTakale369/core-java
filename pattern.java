import java.util.Scanner;

public class pattern {

    // hollrectange pattern --------------------> 

    public static void holloractangel(int torows,int tocolumns) {
        //outer loop
        for(int i =1;i<=torows;i++){

            // inner -columms
            for(int j =1;j<tocolumns;j++){

                // (i,j)
                if(i==1 || i==torows || j==1 || j==tocolumns){
                   
                    // boundery cell
                    System.out.print("*");
                }
                 else{ 
                    System.out.print(" ");
                }
            }
            // next line 
        System.out.println();
        }   
}

// inverted rectangel pattern ------------->

public static void inverted_rectangel(int torows) {

    // outer loop 
    for(int i=1;i<=torows;i++){

        // empty spacecs 
        for(int j=1;j<=torows-i;j++){
            System.out.print(" "); 
        } 

         // Print the " *
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }    

    }
    


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print("How many rows you want : ");
        // int torows =input.nextInt();

        // System.out.print("How many columns you want : ");
        // int tocolumns=input.nextInt();

        // holloractangel(4, 5);
        inverted_rectangel(4);
    }
}
        
    
        