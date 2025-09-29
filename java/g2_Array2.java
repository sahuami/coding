public class g2_Array2 {

  // FUNCTION 8.1(1st method)(MAX SUBARRAY SUM)
  public static void maxSubarraysum(int Number[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < Number.length; i++) {
      int start = i;
      for (int j = i; j < Number.length; j++) {
        int end = j;
        currSum = 0;
        for (int k = start; k <= end; k++) {
          currSum += Number[k];
        }

        System.out.println(currSum);
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("max sum  =" + maxSum);
  }

  // FUNCTION 8.1(1st method)(MAX SUBARRAY SUM)
  public static void main(String[] args) {
    int Number[] = { -1, -2, 6, -1, 3 };
    maxSubarraysum(Number);
  }

}
