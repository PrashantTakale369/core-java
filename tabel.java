// Day 4 
//This code print the tabel which you want...

//Logic()

//step 1 : first we are creat simple Scanner class for by taking user no to print the tabel.. 
//step 2 : then what we are doing we are creat for loop and give coditon i=1 upto 10 becuse this is multiply your no 1,2,3...like this thst's why we are
//creat first  foor loop ..
// step 3 : 
// then we are creat one again for loop bcz which tabel you want this is print that's why we are creat second foor loop </h5>
  



import java.util.Scanner;
public class tabel {
   
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("which table you want : ");
        int tabel =input.nextInt();

        int num =10;
         for(int i=1;i<=num;i++){
            for(int j=1;j<=tabel;j++){
            
             j= tabel*i;
              System.out.println(+ tabel+ "x" + i + "=" + j);
    
            }
           
           
        }
      
    }
 }
    

