import java.util.*;

public class fact{

//  ----Factorial of a given number :

public static int factoral(int n) {
  int fact1=1;

    for(int i=1;i<=n;i++){
      fact1=i*fact1;
    }
  return fact1;
}

// ---find the Binomeal coefficent of NCR


public static int bincoeff(int n, int r) {
  int fact_n = factoral(n);
  int fact_r = factoral(r);
  int fact_nmr = factoral(n-r);

  int bincoeff=fact_n/(fact_r*fact_nmr);
        
  return bincoeff;
    
}

// --- Concept of the Function Overloding
      
public static int multiplication(int a,int b) {
  return a*b;
  }

  public static int multiplication(int a, int b,int c) {
  return a*b*c;
 
}

// Check if a number is prime or not

public static int primeornot(int a) {
  if(a%2==0){
    System.out.print("Numer is not Prime : ");
  }else{
    System.out.print("Numer is prime : ");
    }
   return a;
        
}

  // Convert Bimery TO Decimal.
public static void BinToDeci(int binNum) {
  int myNum=binNum;
  int pow =0;
  int deci=0;
  while (binNum>0) {
  int lastdigit= binNum%10;
  deci=lastdigit*(int) Math.pow(2,pow);

    pow++;
    deci++;
    binNum=binNum/10;
    }
      System.out.println("Decimal of "+ myNum+ " is : " + binNum);
}

// Print the Tabel  upto which you want 

public static void tabel(int num) {

  for(int i=1;i<=10;i++){
    for(int j=1;j<=num;j++){
      int result=i*j;
      System.out.print(+ result);
  }  
  System.out.println();
    }
    
}
    

  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("which no fact you want : ");
    int fact=Sc.nextInt();
    System.out.println(" binomia coiffecant of the give no : ");
    int bin =Sc.nextInt();
    System.out.println("this is the conecept function oveloding : ");   
    int primeornot =Sc.nextInt();
    System.out.println();     
  
   

    }

} 
