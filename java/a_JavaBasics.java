import java.util.Scanner;

public class a_JavaBasics {

  // introduction of java
  // https://www.w3schools.com/java/java_intro.asp
  public static void main(String[] args) {
    System.out.print("hello world 12345");
    System.out.println("hello world 12345");
    System.out.print("hello world 12345\n");
    System.out.print("hello world 12345");
    System.out.println("hello world 12345");
    System.out.println("****");
    System.out.println("***");
    System.out.println("**");
    System.out.println("*");

    // variables: https://www.w3schools.com/java/java_variables.asp
    // variables Syntax:    type variableName = value;

    // DATA TYPES:

    // primitive 8 datatypes
    byte b = 8;
    System.out.println(b);
    char c = 'a';
    System.out.println(c);
    // boolean var = false;
    // float price =10.5;
    // int num =25;
    // long
    // double
    // short n=240;

    // SUM AND COMMENT
    int x = 10;
    int y = 15;
    int sum = x + y;
    System.out.println(sum);

    /*
     * int a=10;
     * int b=15;
     * int sum=a+b;
     * System.out.println(sum);
     */

    // VARIABLES IN JAVA

    int A = 10;
    int B = 5;
    System.out.println(A);
    System.out.println(B);
    // String name = "amit";
    // System.out.println(name);
    A = 15;
    System.out.println(A);

    // SUM ,PRODUCT AND AREA OF CIRCLE (INPUT FROM THE USER)

    Scanner sc = new Scanner(System.in);
    // String input = sc.next();
    // System.out.println(input);

    String name = sc.nextLine();
    System.out.println(name);

    // int number = sc.nextInt();
    // System.out.println(number);

    // float num = sc.nextFloat();
    // System.out.println(num);

    // int a =sc.nextInt();
    // int b =sc. nextInt();
    // int sum =a+b;
    // int product = a*b;
    float r = sc.nextFloat();
    float area = 3.14f * r * r;
    // System.out.println(sum);
    // System.out.println(product);
    System.out.println(area);

    // TYPE CONVERSION

    // this type(widening) conversion is possible bcz size of int less than the size
    // of long.
    // the vice versa is not possible complier shows error(lossy conversion).
    int i = 25;
    long j = i;
    // long a=20;
    // int b=a; this show error bcz long to int can'nt possible
    System.out.println(j);

    // int number = sc.nextFloat();//its not possible
    float number = sc.nextInt(); // it possible
    System.out.println(number);

    // TYPE CASTING
    float num = 99.999f;
    int num2 = (int) num; /*
                           * this type(narrowing) conversion is possible.
                           * we can written as. but decimal digit are loss
                           */
    System.out.println(num2);
    char ch = 'a'; // all charter are assign some value in java.(a to z = 97 se start hai and A to
                   // Z = 65 se start hai)
    int Number = ch;
    System.out.println(Number);

    // TYPE PROMOTION

    char k = ('a');
    char l = ('b');
    /*
     * char c = b-a; its not possible(lossy conversion)
     * bcz all character are assign some value(int) or int to char not possible.
     */
    System.out.println((int) (l));
    System.out.println((int) (k));
    System.out.println(k);
    System.out.println(l - k);

    /*
     * int a= 10;
     * float b= 20.25f;
     * long c = 25;
     * double d =30;
     * double ans =a+b+c+d; // my final ans is double bcz the size of double are
     * greater than all of
     * //int ans = a+b+c+d; //lossy conversion(double to int)
     * System.out.println(ans);
     */

    /*
     * byte b= 5;
     * //byte a= (b*2);// java show lossy converson bcz java read (b*2) as int and
     * int to byte not possible.
     * byte a=(byte)(b*2);
     * System.out.println(a);
     */

    float p = sc.nextFloat();
    float q = sc.nextFloat();

    int a = sc.nextInt();
    int d = sc.nextInt();

    int s = a + d;
    System.out.println("First value: " + p + q + " second value: " + s + ".");

  }
}
