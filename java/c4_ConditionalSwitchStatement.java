import java.util.*;
public class c4_ConditionalSwitchStatement
 {
   public static void main(String[] args) 
   {
     
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int number = sc.nextInt();
    switch(number)
    {
        case 1 : System.out.println("burger");
                  break;        /*  break ka use isliye krte hai agr koi case print hota hai 
                                    toh uske aage ke sare case bhi print hote hai. break ka use
                                     ni karege toh aage ke sare case print ho jayge*/
        case 2 : System.out.println("pizza");
                  break;
        case 3 : System.out.println("momo");
                 break;
        default : System.out.println("we wake up");
                 break;


    }   
  /*  char ch = 'b';
    switch(ch)
    {
        case 'a' : System.out.println("burger");
                  break;       
        case 'b': System.out.println("pizza");
                  break;
        case 'c': System.out.println("momo");
                 break;
        default : System.out.println("we wake up");
                 break;

    }*/

    // calculator

    System.out.println("enter a :");
    int a = sc.nextInt();
    System.out.println("enter b :");
    int b =sc.nextInt();
    System.out.println("enter operator :");
    char operator = sc.next().charAt(0);
    

    switch(operator)
    {
        case '+' :System.out.println(a+b);
                  break;
        case '-' : System.out.println(a-b);
                  break;        // break ka use isliye krte hai agr koi case print hota hai toh uske aage ke sare case bhi print hote hai. break ka use ni karege toh aage ke sare case print ho jayge
        case '*' : System.out.println(a*b);
                  break;
        case '/' : System.out.println(a/b);
                 break;
        case '%' :  System.out.println(a%b);
                 break;
        default : System.out.println("wrong operator");
                 break;


    }
  }
}
   




    


