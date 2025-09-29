public class n_Backtracking {

    // BACKTRACKING - ARRAYS

    public static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // function call step
        arr[i] = arr[i] - 2; // backtracking step

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }




    // FIND SUBSETS
    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);

            }
            return;
        }

        // recursion call
        // Yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        // No choice
        findSubsets(str, ans, i + 1);

    }




    // FIND PERMUTATION
    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(NewStr, ans + current);
        }
    }

 


    //N-QUEEN(place one queen in every row)
public static  void nQueens(char board[][],int row){

    //base case
if(row == board.length){
    printBoard(board);
    return;
}
    //column loop
    for(int j=0; j<board.length; j++){
        board[row][j]= 'Q';
        nQueens(board,row+1);  //function call
        board[row][j]= '.';    // backtracking step
    }
}


public static void printBoard(char board[][]){
   System.out.println("____chess board___");
    for(int i=0; i<board.length; i++){
        for(int j=0; j<board.length; j++){
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
}


    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);

        String str = "abc";
        findSubsets(str, "", 0);

        findPermutation(str, "");

        int n=2;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               board[i][j] = '.';
            }
        }
        nQueens(board,0);
    }
}



