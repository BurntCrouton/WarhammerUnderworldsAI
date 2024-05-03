import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class myClass {
    public static void main(String[] args) {
      int numBoardHexesY;
      int numBoardHexesX;
      int numSingleBoardHexesY;
      int numSingleBoardHexesX;
      String globalboardFormat = " ";
      
      // boolean boardLong = false; 
      // boolean boardWide = false; // the different Board layouts possible in Warhammer Underworlds
      
      int[] dualLengthBoard = {5, 8, 5, 16};
      int[] dualWidthBoard = {5, 8, 10, 8};

      Scanner myObj = new Scanner(System.in); 
      System.out.println("Enter preferred board Format: ");
      
      try {
        TimeUnit.SECONDS.sleep(5);
        String boardFormat = myObj.nextLine();
        globalboardFormat = boardFormat;
      } catch (InterruptedException e) {
        System.err.format("IOException: %s%n", e);
      }
      
      
      if(globalboardFormat == "boardLong") {
        numBoardHexesY = dualLengthBoard[3];
        numBoardHexesX = dualLengthBoard[2];
        numSingleBoardHexesY = dualLengthBoard[1];
        numSingleBoardHexesX = dualLengthBoard[0];

        System.out.println("Board Format is: " + globalboardFormat); 
        System.out.println(numBoardHexesY);
        System.out.println(numBoardHexesX);
        System.out.println(numSingleBoardHexesY);
        System.out.println(numSingleBoardHexesX);
      } else if(globalboardFormat == "boardWide") {
        numBoardHexesY = dualWidthBoard[3];
        numBoardHexesX = dualWidthBoard[2];
        numSingleBoardHexesY = dualWidthBoard[1];
        numSingleBoardHexesX = dualWidthBoard[0];

        System.out.println("Board Format is: " + globalboardFormat); 
        System.out.println(numBoardHexesY);
        System.out.println(numBoardHexesX);
        System.out.println(numSingleBoardHexesY);
        System.out.println(numSingleBoardHexesX);
      } else if(globalboardFormat != "boardWide" && globalboardFormat != "boardLong") {
        System.out.println("404 Board Format not found");
      }
    }
}
