import java.util.Scanner;
public class c3_ConditionalTernaryOperator {





  public static void findLargest() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the  first number");
    int n = sc.nextInt();
    System.out.println("enter the  second number");
    int m = sc.nextInt();
    String a = (n>m) ? ( n +" is largest  then " + m) : (n + " is not largest then "+ m);
    System.out.println(a);
}


public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the num");
  int num = sc.nextInt();
String type  =(num%2 ==0) ?"even":"odd";
System.out.println(type);


// check the student will pass or fail
System.out.println("enter the marks");
float marks =sc.nextFloat();
String result = (marks>=33)?"pass":"fail";
System.out.println(result);

findLargest();

}


}
