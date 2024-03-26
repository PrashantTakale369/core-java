import java.util.Scanner;

public class quize2 {

 public static void main(String[] args) {
          
 String[][] quize = {
    
                    { // Quize 1 :
    
                            "What Is The Capital of INDIA", "A:Kolkata\nB:Mumbai\nC:Chennai\nD:Delhi", "D"
    
                    }, { // Quize 2 :
    
                            "What is the name of the current president of the United States?",
                            "A:Joe Biden\nB:Donald Trump\nC:Barack Obama\nD:George Bush", "A"
    
                    }, { // Quize 3
    
                            "Java is  ______ Programming language",
                            "A:Object Oriented\nB: Scripting\nC: Logical\nD: Dynamic", "A"
    
                    } };
    
            int total_question = quize.length;
    
            for (int i = 0; i < total_question; i++) { // remove the semicolon here
                System.out.println(quize[i][0]); // print the question
                System.out.println(quize[i][1]); // print the options
                System.out.println(); // print a blank line
            }
        }
    }
    
    

