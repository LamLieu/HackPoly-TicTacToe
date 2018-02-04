import java.awt.event.MouseListener;

public class Board {
   private char[][] board;

   public Board() { //sets creates 2D array of board and stores an empty space in all spots
      board = new char[2][2];
      for (int row = 0; row < 3; row++) {
         for (int col = 0; col < 3; col++) {
            board[row][col] = ' ';
         }
      }
   }

   public void updateBoardPlayer(int row, int col, char character) {
      if (board[row][col] != ' ') {
         System.out.printf("Unable to place %c", character);
      }
   }

   public char[][] updateBoardComputer() {
      return board;
   }

   public char[][] getBoard() {
      return board;
   }

   public void printBoard() {
      for (int row = 0; row < 3; row++) {
         for (int column = 0; column < 3; column++) {
            System.out.print(board[row][column]);
         }
         System.out.println();
      }
   }
}
