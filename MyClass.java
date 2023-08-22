import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        boolean isGameRunning = true;
      char[][] gameBoard = {{'1', '|', '2', '|', '3'},
      {'-', '+', '-', '+', '-'},
      {'4', '|', '5', '|', '6'},
      {'-', '+', '-', '+', '-'},
      {'7', '|', '8', '|', '9'}};
      
      printGameBoard(gameBoard);
      while (isGameRunning) {
          Scanner scan = new Scanner(System.in);
     System.out.println("Enter your move X(1-9) and O(11-19) and 20 to end the game:");
     int p = scan.nextInt();
     
     System.out.println(p);
     
     switch(p) {
         case 1:
             gameBoard[0][0] = 'X';
             break;
         case 2:
             gameBoard[0][2] = 'X';
             break;
         case 3:
             gameBoard[0][4] = 'X';
             break;
         case 4:
             gameBoard[2][0] = 'X';
             break;
         case 5:
             gameBoard[2][2] = 'X';
             break;
         case 6:
             gameBoard[2][4] = 'X';
             break;
         case 7:
             gameBoard[4][0] = 'X';
             break;
         case 8:
             gameBoard[4][2] = 'X';
             break;
         case 9:
             gameBoard[4][4] = 'X';
             break;
     }
     
     switch(p) {
         case 11:
             gameBoard[0][0] = 'O';
             break;
         case 12:
             gameBoard[0][2] = 'O';
             break;
         case 13:
             gameBoard[0][4] = 'O';
             break;
         case 14:
             gameBoard[2][0] = 'O';
             break;
         case 15:
             gameBoard[2][2] = 'O';
             break;
         case 16:
             gameBoard[2][4] = 'O';
             break;
         case 17:
             gameBoard[4][0] = 'O';
             break;
         case 18:
             gameBoard[4][2] = 'O';
             break;
         case 19:
             gameBoard[4][4] = 'O';
             break;
     }
     printGameBoard(gameBoard);
     
     switch(p) {
         case 20:
         System.out.println ("Game Ended");
         break;
     }
     
      }
     
    }
    
    public static void printGameBoard(char [][] gameBoard) {
        for(char[] row : gameBoard) {
            for(char g : row) {
                System.out.print(g);
            }
            System.out.println();
        }
    }
}





