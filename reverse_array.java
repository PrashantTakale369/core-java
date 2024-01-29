public class reverse_array {

public static void revearr(int number[]){      //----reverse the given array

int start=0;
int end = number.length-1;

    while(start<end){
     int temp=end;
     end=start;
     start= temp;

     start++;
     end++;

    }
}

public static void pairs_array(int number[]){         //-- pairs of the given arry (2,3) like that

for(int i=0;i<number.length;i++){
    int curr=number[i];
        for(int j=i+1;j<number.length;j++){
            System.out.print( "("+ curr +","+ number[i] +")" );
        
        }
            System.out.println();
    }

}

public static void sub_array(int number[]){    //------Print the sub_array . ex= (2)-- (4,6,8,10)

for(int i=0;i<number.length;i++){
    int start=i;
       for(int j=i;j<number.length;j++){
         int end =j;
            for(int k=start;k<=end;k++){
             System.out.print(number[k]+ " ");
            } 
            System.out.println();     
       } 
       System.out.println();
   }
   
}

public static void max_sub_array(int number[]){

int currsum=0;
int maxsum=Integer.MIN_VALUE;

 for(int i=0;i<number.length;i++){
    int start=i;
      for(int j=i;j<number.length;j++){
        int end =j;
        currsum=0;
        for(int k=start;k<=end;k++){
            currsum+=number[k];

        }
          System.out.println(+currsum);
          if(maxsum<currsum){
            maxsum=currsum;
          }
      }
    }
    System.out.println("max sum of the array is : " +maxsum);
}


public static void main(String[] args) {
    int number[]={2,4,6,8,10};

//{1}
    // revearr(number)
    //   for(int i=0;i<number.length;i++){
    //      System.out.print(number[i]+" ");
    //  } System.out.println();


//{2}
     // pairs_array(number);


//{3}
    sub_array(number);


//{4}

max_sub_array(number);
   
   
     }
    
}
