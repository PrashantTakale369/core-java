 public class kadans{
 public static void max_subarray_kadan(int number[]) {
 
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for(int i=0;i<number.length;i++){
        cs =cs+number[i];
        if(cs<0){
            cs=0;
        }
        ms= Math.max(cs,ms);
    }

System.out.println("our max sum is : " + ms);

 }

 public static void main(String[]args){
  int nmuber[] = {-2,-5,4,8,-5,7,-5};
  max_subarray_kadan(nmuber);
 }
}

 
