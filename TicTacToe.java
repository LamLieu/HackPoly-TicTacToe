public class TicTacToe {
   public static void main(String[] args) {
      boolean checkContinue = false;
      Board boardObj = new Board();
      char[][] board = new char[2][2];

      do {
         if (boardObj.checkWin('X')) {
            System.out.println("You win!");
            checkContinue = true;
         }
         else if (boardObj.checkWin('O')) {
            System.out.println("You lose!");
            checkContinue = true;
         }
         for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
               if (board[row][column] != 'X' || board[row][column] != 'O') {
                  break;
               }
               else {
                  board = boardObj.resetGame();
               }
            }
         }
      } while (!checkContinue);
   }
}
