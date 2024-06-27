
import java.util.Scanner;
public class Recursion_all {

// Factorial the given number : 

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=factorial(n-1);
        int fn= n * factorial(n-1);
     return fn;
 }

// print the numbers from n to 1 in (decrising order)

public static void num(int pn){
    if(pn==1){
        System.out.println(pn);
        return;
    }
    System.out.print(pn+ " ");
   num(pn-1);
   
}

// print the numbers from n to 1 in (incrising order)

public static void num1(int pn1){

    if(pn1==1){
        System.out.print(pn1+" ");
        return;
    }
    num1(pn1-1);
    System.out.print(pn1+ " ");
   
}

//print sum of n natural no is : 

public static int PrintSum(int n){
    if(n==1){
        return 1;
    }
    int snm1 =PrintSum(n-1);
    int sn= n+snm1;
    return sn;
}

// fibonacci seris for nth term

public static int fib(int n){

    if(n==0 || n==1){
        return n;
    }
   
    int fnm1=fib(n-1);
    int fnm2=fib(n-2);

    int FN = fnm1+fnm2;
    return FN;
}

//check if given array is sorted or not 

public static boolean Array_sorted(int arr[],int i){

    if(arr[i]==arr.length-1){
        return true;
    }
    if(arr[i]>arr[i+1]){
    return false ;
    }
return Array_sorted(arr,i+1);

}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // int n = sc.nextInt();
    // System.out.println("factoerial of "+n+"! is : "+factorial(n));

    // int no =sc.nextInt();
    // num(no);

    // int n1 =sc.nextInt();
    // num1(n1);

    // int n= sc.nextInt();
    // System.out.println("Sum of "+ n +"is : "+ PrintSum(n));

    // int n= sc.nextInt();
    // System.out.println("Fibonnaci series of "+n+"th term is : "+ fib(n));

    int arr[]={1,2,3,4,5};
    System.out.println(Array_sorted(arr,0));
   

}  
}
