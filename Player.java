import java.util.Scanner;
public class Player {
   private char character;
   private Board board = new Board();
   private Scanner kb = new Scanner(System.in);
   private int row, column;

   public Player() {
      character = 'O';
   }
   public void setCharacter() {
      String input;
      boolean check = false;
      do {
         input = kb.nextLine();
         if (Character.toLowerCase(input.charAt(0)) == 'X') {
            character = 'X';
            check = true;
         } else if (Character.toLowerCase(input.charAt(0)) == 'O') {
            character = 'O';
            check = true;
         } else {
            System.out.println("Error: Please enter either X or O.");
         }
      } while (!check);
   }

   public char getCharacter() {
      return character;
   }

   public void setRow() {
      System.out.print("Row(enter 1-3): ");
      do {
         row = Integer.parseInt(kb.nextLine());
         if (row < 1 || row > 3)
            System.out.println("Please enter a row number (1-3): ");
      } while (row < 1 || row > 3);
   }

   public int getRow() {
      return row;
   }

   public void setColumn() {
      System.out.print("Column(enter 1-3): ");
      do {
         column = Integer.parseInt(kb.nextLine());
         if (column < 1 || column > 3)
            System.out.print("Please enter a row number (1-3): ");
      } while (column < 1 || column > 3);
   }

   public int getColumn() {
      return column;
   }

}
