import java.util.*;

public class quize_1d_array {
    public static void main(String[]args){

        String[] questions = {
            "What is the capital of India?",
            "Which planet is the second from the sun?",
            "Who is the author of Harry Potter series?",
            "What is the largest animal in the world?",
            "How many continents are there on Earth?"
          };
          
    
          String[] options = {
            "A) Delhi, B) Mumbai, C) Kolkata, D) Chennai",
            "A) Mercury, B) Venus, C) Earth, D) Mars",
            "A) J.R.R. Tolkien, B) George R.R. Martin, C) J.K. Rowling, D) Stephen King",
            "A) Elephant, B) Whale, C) Giraffe, D) Crocodile",
            "A) Five, B) Six, C) Seven, D) Eight"
          };
          
          char[] answers = {'A', 'B', 'C', 'B', 'C'};
          
       
          int totalQuestions = questions.length;
          int score = 0;
          
          
          Scanner scanner = new Scanner(System.in);
          
        
          for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);

            String[] currentOptions = options[i].split(", ");
            for (int j = 0; j < 4; j++) { // changed the condition here
              System.out.println(currentOptions[j]);
            }

            
            System.out.print("Enter your answer (A, B, C, or D): ");
            String input = scanner.nextLine();
      
            
            if (input.length() == 1 && input.charAt(0) == answers[i]) {
             
              score++;
              System.out.println("Correct!");
            } else {
              System.out.println("Wrong! The correct answer is " + answers[i]);
            }
            System.out.println();
          }
          
          System.out.println("You have completed the quiz!");
          System.out.println("Your final score is " + score + " out of " + totalQuestions);

  }
}
