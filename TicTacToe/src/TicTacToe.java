import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String [] args){

        // lets print out the game board, 3 rows and column

        // lets create a two dimensional array
        char [] [] gameBoard ={{' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}};


   // to get input from the user,


        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9)");
            int playerPos = scan.nextInt();


            placePiece(gameBoard, playerPos, "player");


            //CPU player
            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            placePiece(gameBoard, cpuPos, "cpu");


            prinGameBoard(gameBoard);
        }
    }
    // lets create the logic for the game and printing out the board
      public static void prinGameBoard(char [][] gameBoard) {
          for (char[] row : gameBoard) {
              for (char c : row) {
                  System.out.print(c);
              }
              System.out.println();
          }
      }
      public static void placePiece(char[][] gameBoard, int pos,String user){
         // create the lpgic for playing the input
          char symbol =' ';
          if(user.equals("player")){
              symbol ='X';
          } else if (user.equals("cpu")) {
              symbol ='0';
          }
          switch (pos){
              case 1:
                  gameBoard[0][0] = symbol;
                  break;
              case 2:
                  gameBoard[0][2] =symbol;
                  break;
              case 3:
                  gameBoard[0][4] =symbol;
                  break;
              case 4:
                  gameBoard[2][0] =symbol;
                  break;
              case 5:
                  gameBoard[2][2] =symbol;
                  break;
              case 6:
                  gameBoard[2][4] =symbol;
                  break;
              case 7:
                  gameBoard[4][0] =symbol;
                  break;
              case 8:
                  gameBoard[4][2] =symbol;
                  break;
              case 9:
                  gameBoard[4][4] =symbol;
                  break;
              default:
                  break;
          }
      }
}
