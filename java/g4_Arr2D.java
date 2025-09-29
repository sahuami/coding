public class g4_Arr2D 
{
     // FUNCTION (SPIRAL MATRIX)
     public static void printSpiral(int Matrix[][])
     {
       int startRow = 0;
       int startCol = 0;
       int endRow = Matrix.length-1;
       int endCol = Matrix[0].length-1;
 
       while(startRow <=endRow && startCol <= endCol)
       {// TOP
           for(int j=startCol; j<=endCol; j++)
           {
             System.out.print(Matrix[startRow][j]+" ");
           }
        // RIGHT
        for(int i=startRow+1; i<=endRow; i++)
        {
         System.out.print(Matrix[i][endCol]+" ");
 
        }
        // BOTTOM
          for(int j=endCol-1; j>=startCol; j--)
          {if(startRow == endRow)
           {
             break;
           }
           System.out.print(Matrix[endRow][j]+" ");
          }
          
          //LEFT
          for(int i=endRow-1; i>=startRow+1; i--)
          {
           if(startCol == endCol)
             {
               break;
             }
           System.out.print(Matrix[i][startCol]+" ");
           
          }
          startRow++;
          startCol++;
          endRow--;
          endCol--;
         }
     System.out.println();
   
 }
 
  public static void main(String[] args) 
  {// FUNCTION (SPIRAL MATRIX)
int Matrix[][] = {{1,2,3,4},
                  {5,6,7,8},
                  {9,10,11,12},
                  {13,14,15,16}};
printSpiral(Matrix);
     
}
}