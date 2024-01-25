import java.util.Scanner;
public class tabel {
   
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("which table you want : ");
        int tabel =input.nextInt();

       
         for(int i=1;i<=10;i++){
            
            for(int j=1;j<=tabel;j++){   
            System.out.print(+ i*j + "\t" );
        }
            System.out.println();
          
        }
      
    }
 }
    

