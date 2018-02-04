public class Board {
   private char[][] board;

   public boolean checkWin(char character) {
      if (checkRowWin(character) == 3) {
         return true;
      }
      else if (checkColumnWin(character) == 3) {
         return true;
      }
      else if (checkDiagonalWin(character) == 3) {
         return true;
      }
      else
         return false;
   }

   private int checkRowWin(char character) {
      int count = 0;
      for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
         for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            if (board[rowIndex][columnIndex] == character) {
               count++;
            }
         }
      }
      return count;
   }

   private int checkColumnWin(char character) {
      int count = 0;
      for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
         for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
            if (board[rowIndex][columnIndex] == character) {
               count++;
            }
         }
      }
      return count;
   }

   private int checkDiagonalWin(char character) {
      int count = 0;
      for (int rowIndex = 0, columnIndex = 0; rowIndex < 3 || columnIndex < 3; rowIndex++, columnIndex++) {
         if (board[rowIndex][columnIndex] == character) {
            count++;
         }
      }
      return count;
   }
   public char[][] resetGame() {
      for (int row = 0; row < 3; row++) {
         for (int column = 0; column < 3; column++) {
            board[row][column] = ' ';
         }
      }
      return board;
   }
}
