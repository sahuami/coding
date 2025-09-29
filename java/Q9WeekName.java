import java.util.*;
public class Q9WeekName
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the weak number");
        int Weaknumber = sc.nextInt();

switch(Weaknumber)
{
    case 1 : System.out.println("sunday");
             break;
    case 2 : System.out.println("monday");
             break;
    case 3 : System.out.println("tuesday");
             break;
    case 4 : System.out.println("wenesday");
             break;
    case 5 : System.out.println("thursday");
             break;
    case 6 : System.out.println("friday");
             break;
    case 7 : System.out.println("saturday");
             break;
    default : System.out.println("this number can't any day");
             break;

}

// what is the value of x and y
  int a = 63 , b = 36;
  boolean x = (a<b)? true :false;
  int y  = (a>b) ? a : b;
  System.out.println(x);
  System.out.println(y);




    }
}
