public class MyClass {
    public static void main(String args[]) {
      int numBoardHexesY;
      int numBoardHexesX;
      int numSingleBoardHexesY;
      int numSingleBoardHexesX;
      
      bool boardLong = false; 
      bool boardWide = false; 
      
      
      int[] dualLengthBoard = {5, 8, 5, 16};
      int[] dualWidthBoard = {5, 8, 10, 8};

      if(boardLong == true) {
        numBoardHexesY = dualLengthBoard[3];
        numBoardHexesX = dualLengthBoard[2];
        numSingleBoardHexesY = dualLengthBoard[1];
        numSingleBoardHexesX = dualLengthBoard[0];
      } else if(boardWide == true) {
        numBoardHexesY = dualWidthBoard[3];
        numBoardHexesX = dualWidthBoard[2];
        numSingleBoardHexesY = dualWidthBoard[1];
        numSingleBoardHexesX = dualWidthBoard[0];

        System.out.println(numBoardHexesY);
        System.out.println(numBoardHexesX);
        System.out.println(numSingleBoardHexesY);
        System.out.println(numSingleBoardHexesX);
      }
    }
}
