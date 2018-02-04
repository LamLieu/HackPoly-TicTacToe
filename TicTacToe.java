import java.util.Scanner;

public class TicTacToe {
   public static void main(String[] args) {
      String input;
      int row, col;
      char character;
      char[][] board;

      Scanner kb = new Scanner(System.in);
      Player player = new Player();

      System.out.println("Welcome to the Tic Tac Toe Game!");
      System.out.print("Pick your character X or O (type X or O): ");
      player.setCharacter();

      System.out.printf("Where would you like to place your %c?\n", player.getCharacter());
      row = player.getRow();
      col = player.getColumn();


   }
}