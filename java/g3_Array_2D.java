import java.util.Scanner;

public class g3_Array_2D {
  // FUNCTION (SEARCHING KEY)
  public static boolean Search(int matrix[][], int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.println("found at cell(" + i + "," + j + ")");
          return true;
        }
      }
    }
    System.out.println("key not found");
    return false;
  }

  // FUNCTION (SPIRAL MATRIX)
  public static void printSpiral(int Matrix[][]) {
    
    int startRow = 0;
    int startCol = 0;
    int endRow = Matrix.length - 1;
    int endCol = Matrix[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {
      // TOP
      for (int j = startCol; j <= endCol; j++) {
        System.out.print(Matrix[startRow][j] + " ");
      }


      // RIGHT
      for (int i = startRow + 1; i <= endRow; i++) {
        System.out.print(Matrix[i][endCol] + " ");


      }
      // BOTTOM
      for (int j = endCol - 1; j >= startCol; j--) {
        if (startRow == endRow) {
          break;
        }
        System.out.print(Matrix[endRow][j] + " ");
      }


      // LEFT
      for (int i = endRow - 1; i >= startRow + 1; i--) {
        if (startCol == endCol) {
          break;
        }
        System.out.print(Matrix[i][startCol] + " ");

        
      }
      startRow++;
      startCol++;
      endRow--;
      endCol--;
    }
    System.out.println();

  }

  // FUNCTION (DIAGONAL SUM)
  public static int diagonalSum(int MATRIX[][]) {
    int sum = 0;
    // isme bigO n^2 time comlexity aaygi jo ki jada hai isliye hum 2nd method se
    // karege solve
    // for(int i=0; i<MATRIX.length; i++)
    // {
    // for(int j=0; j<MATRIX[0].length; j++)
    // {
    // if(i ==j)
    // {
    // sum += MATRIX[i][j];
    // }
    // else if(i+j == MATRIX.length-1)
    // {
    // sum += MATRIX[i][j];
    // }
    // }
    // }
    // System.out.println(sum);
    // return sum;

    // isme best time complexity(linear comlexity) aayge
    for (int i = 0; i < MATRIX.length; i++) {// primary diagonal
      sum += MATRIX[i][i];
      // secondary diagonal
      if (i != MATRIX.length - i - 1) {
        sum += MATRIX[i][MATRIX.length - i - 1];
      }
    }
    System.out.println(sum);
    return sum;

  }

  // FUNCTION ( SEARCHING IN SORTING MATRIX)
  public static boolean search_in_sorted_matrix(int mat[][], int key) {
    int row = 0, col = mat[0].length - 1;

    while (row < mat.length && col >= 0) {
      if (mat[row][col] == key) {
        System.out.println("found key at(" + row + "," + col + ")");
        return true;
      } else if (key < mat[row][col]) {
        col--;
      } else {
        row++;
      }
    }
    System.out.println("key not found");
    return false;
  }

  public static void main(String[] args) {
    int matrix[][] = new int[2][3];
    int n = matrix.length, m = matrix[0].length;
    // user se input liya hai yaha par
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    // OUTPUT
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    // FUNCTION (SEARCHING KEY)
    Search(matrix, 6);

    // FUNCTION (SPIRAL MATRIX)
    int Matrix[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };
    printSpiral(Matrix);

    // FUNCTION (DIAGONAL SUM)
    int MATRIX[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };
    diagonalSum(MATRIX);

    // FUNCTION ( SEARCHING IN SORTING MATRIX)
    int mat[][] = { { 10, 20, 30, 40 },
        { 15, 25, 35, 45 },
        { 27, 29, 37, 48 },
        { 32, 33, 39, 50 } };
    int key = 33;
    search_in_sorted_matrix(mat, key);

  }

}
