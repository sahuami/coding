import java.util.Scanner;

public class f3_FunctionOverloading {
  // define: functions with the same name but different parameter

  // funtion overloading (using DATA TYPES)

  // function to calculate int sum
  public static int Add(int p, int q) {
    return p + q;
  }

  // function to calculate float sum
  public static float Add(float i, float j) {
    return i + j;
  }

  // funtion overloading (using PARAMETER)

  // funtion call sum 2 number
  public static int sum(int a, int b) {
    return a + b;
  }

  // funtion call sum 3 number
  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {

    // agar hum user se input lenge toh error show hoga kyuki int or float dono m
    // 'p'or 'q'
    // same hai isliye complier confuse ho jayga ki value int me dene hai ya float me
    
      // Scanner sc = new Scanner(System.in);
      // System.out.println("enter the integer p");
      // int p = sc.nextInt();
      // System.out.println("enter the integer q");
      // int q = sc.nextInt();
      // System.out.println("enter the floating p");
      // float p = sc.nextFloat();
      // System.out.println("enter the floating q");
      // float q = sc.nextInt();
      // System.out.println(sum(p,q));
      // System.out.println(sum(p,q));
     
    System.out.println(Add(3, 5));
    System.out.println(Add(3.5f, 2.6f));

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the a");
    int a = sc.nextInt();
    System.out.println("enter the b");
    int b = sc.nextInt();
    System.out.println("enter the c");
    int c = sc.nextInt();
    System.out.println("the sum of two number :" + sum(a, b));
    System.out.println("the sum of three number :" + sum(a, b,c));
  }
}
