public class linear_search { 

    public static int linersear( int number_i[], int key) {

         for(int i=0; i<number_i.length; i++){    /*This line read all the list of the aary */  
             if(number_i[i]==key){
              return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {

        int number_i[]={2,4,6,8,10,12,14,16,18,20};
        int key =20;

        // String list[]={"dosa","vada pav","samosa","chai","pav bhaji","misal pav"};
        // String keyString = "5";

        int index=linersear(number_i,key);
        if(index==-1){
        System.out.println(" not found : "+ key);
        }else
        System.out.println("Loction of the key is : " + index);


// liner_sear( list, keyString);

        // if(index1==-1){
        //     System.out.println("NOT FOUND : "+ keyString);
        // }
        // else{
        //     System.out.println("Your order Location is : " +index1);
        // }
        
    }
}
    

