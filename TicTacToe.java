import java.util.Scanner;

public class TicTacToe {
   public static void main(String[] args) {
      String input;
      Scanner kb = new Scanner(System.in);
      System.out.println("Welcome to the Tic Tac Toe Game!");
      System.out.print("Pick your character X or O (type X or O): ");
      input = kb.nextLine();
      if (input.charAt(0) == 'X') {

      }
      else if (input.charAt(0) == 'O') {

      }
      else {
         System.out.println("Error: Please enter either X or O.");

      }

   }
}