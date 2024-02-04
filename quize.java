import java.util.Scanner;

public class quize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] quize = {

                { // Quize 1 :
                        "Q1: What Is The Capital of INDIA", 
                        "  A:Kolkata\n  B:Mumbai\n  C:Chennai\n  D:Delhi",
                        "D"
                }, 
                { // Quize 2 :
                        "Q2: What is the name of the current president of the United States?",
                        "  A:Joe Biden\n  B:Donald Trump\n  C:Barack Obama\n  D:George Bush",
                        "A"
                },
                { // Quize 3
                        "Q3: Java is  ______ Programming language",
                        "  A:Object Oriented\n  B: Scripting\n  C: Logical\n  D: Dynamic",
                        "A"
                }
             };

        
        int won=0;
        int[] prizes = {10000, 20000, 30000};        // declare a variable to store the score
        String userAnswer; 
        int total_question = quize.length;             // declare a variable to store the user's input
                                 

        for (int i = 0; i < total_question; i++) { 
            System.out.println(quize[i][0]);       // print the question
            System.out.println(quize[i][1]);
            System.out.print("Enter your answer: ");     // prompt the user to enter the answer
            userAnswer = input.nextLine();  
                     

            if (userAnswer.equals(quize[i][2])) {          // compare the user's input with the correct answer
             won+= prizes[i];  
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!"); 
                System.out.println("you Exit the game : ");
                break;
            }
            System.out.println("You won " + prizes[i] + " rupees!");
            System.out.println();     
        
         
        }

    
    }
}
