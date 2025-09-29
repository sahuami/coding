import java.util.*;

public class c2_Conditionalelseif {
  public static void main(String[] args) {
    int age = 16;
    if (age >= 18) /*
                    * the 'if' statement is true than the complier not check 'else if' statement
                    * and it is false than complier check 'else if' statement.
                    */
    {
      System.out.println("adult");
    } else if (age >= 13 && age < 18) {
      System.out.println("teenager");
    }

    else {
      System.out.println("child");
    }

    // calculate income tax

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the income");
    int income = sc.nextInt();
    float tax;
    if (income < 500000) {
      tax = 0;
    } else if (income >= 500000 && income < 1000000) {
      tax = (float) (income * 0.2);

    } else {
      tax = (float) (income * 0.3);
    }
    System.out.println("your tax is:" + tax);

    // largest of 3 number
    System.out.println("enter the A");
    int A = sc.nextInt();
    System.out.println("enter the B");
    int B = sc.nextInt();
    System.out.println("enter the C");
    int C = sc.nextInt();

    if ((A >= B) && (A >= C)) {
      System.out.println("A is largest");

    } else if (B >= C) {
      System.out.println("B is largest");

    } else {
      System.out.println("C is largest");

    }
  }
}
