import java.util.*;

public class d1_loopWhileLoop {
  public static void main(String[] args) {
    /*
     * int counter = 0;
     * while (counter<5)
     * ese condition kabhi ni deni jo infinite tk chle or vo tabhi rukegi jb
     * hamari code memory fullfill ho jaygi or error show ho jayga
     * 
     * {
     * System.out.println("hello world");
     * counter++;
     * }
     * 
     * System.out.println("printed hello world 5 times");
     */

     
    // print n natural number without user input
    int count = 1;
    while (count <= 10) {
      System.out.print(count + " ");
      count++;
    }

    // print n natural number with user input
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the N");
    int N = sc.nextInt();
    int counter = 1;
    while (counter <= N) {
      System.out.println(counter + " ");
      counter++;
    }

    // sum n natural number
    System.out.println("enter the n");
    int n = sc.nextInt();
    int sum = 0;
    int i = 1;
    while (i <= n) {
      sum += i;
      i++;
    }
    System.out.println("sum is :" + sum);

  }
}
