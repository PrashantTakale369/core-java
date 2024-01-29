public class binery_search {
    public static int binSer(int numbers[],int key){

        for(int i =0;i<numbers.length;i++){
            int start=0,end=numbers.length-1;

            while(start<=end){
                int mid=(start+end)/2;

                if(numbers[mid]==end){
                    return mid;

                }
                if(start<mid){
                    start=mid+1;
                }else{
                    end=mid-1;
                    return -1; }
             } 
           
   }
   return -1;
}
        public static void main(String[] args) {
        
        int numbers[]={2,4,6,8,10,12,14,16,18,20};
        int key =10;
        System.out.println("index of the Key is : "+ binSer(numbers, key));
        }
}

