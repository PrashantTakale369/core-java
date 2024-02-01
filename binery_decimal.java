public class binery_decimal{

// convert Binery to Decimal. 
 
public static void BinToDeci(int binNum) {
 int pow =0;
 int deci =0;
 int myNum=binNum;

    while (binNum>= 0) {
     int lastdigit= binNum%10;
     deci=lastdigit*(int) Math.pow(2,pow);

      pow++;
      deci++;
      binNum=binNum/10;
    }
 System.out.println("Decimal of "+ myNum+ " is : " + binNum);
}
 
  public static void main(String[] args) {
  int number =1011;
    BinToDeci(number);
  } 

}