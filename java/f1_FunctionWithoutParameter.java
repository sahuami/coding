import java.util.Scanner;

public class f1_FunctionWithoutParameter {

  public static void printamit()
  // funtion 1
  {
    System.out.println("Amit");
    System.out.println("Amit");
    return; /*
             * yaha pr hum 'return' likh bhi skte hai or nhi bhi kyuki function ka
             * return type humne void liya hai isliye koi error show ni hoga agar
             * return type int, char, ya phir or koi hota toh hume 'return' likhna
             * hota or return ke aage ye bhi likhna hota ki kitni bhaar humne
             * print karaya hai ( return 2;)
             */
  }
  // funtion 2 (method 1st : without parameter)

  public static void calculateSum() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the a");
    int a = sc.nextInt();
    System.out.println("enter the b");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println("sum is :" + sum);
  }

  public static void main(String[] args) {
    printamit(); // function call
    calculateSum();
  }
}
