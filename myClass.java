import java.util.Scanner;

public class myClass {
    public static void main(String[] args) {
      int numBoardHexesY;
      int numBoardHexesX;
      int numSingleBoardHexesY;
      int numSingleBoardHexesX;
      
      // boolean boardLong = false; 
      // boolean boardWide = false; // the different Board layouts possible in Warhammer Underworlds
      
      int[] dualLengthBoard = {5, 8, 5, 16};
      int[] dualWidthBoard = {5, 8, 10, 8};

      Scanner myObj = new Scanner(System.in); 
      System.out.println("Enter preferred board Format: ");
      String boardFormat = myObj.nextLine();

      if(boardFormat == "boardLong") {
        System.out.println("Board Format is: " + boardFormat);
        numBoardHexesY = dualLengthBoard[3];
        numBoardHexesX = dualLengthBoard[2];
        numSingleBoardHexesY = dualLengthBoard[1];
        numSingleBoardHexesX = dualLengthBoard[0];
      } else if(boardFormat == "boardWide") {
        numBoardHexesY = dualWidthBoard[3];
        numBoardHexesX = dualWidthBoard[2];
        numSingleBoardHexesY = dualWidthBoard[1];
        numSingleBoardHexesX = dualWidthBoard[0];

        System.out.println("Board Format is: " + boardFormat); 
        System.out.println(numBoardHexesY);
        System.out.println(numBoardHexesX);
        System.out.println(numSingleBoardHexesY);
        System.out.println(numSingleBoardHexesX);
      }
    }
}
