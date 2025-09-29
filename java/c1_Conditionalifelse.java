import java.util.*;

public class c1_Conditionalifelse
 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the age");
       int age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("adult : drive , vote");
        }
      /*   if(age > 13 && age < 18)
        {
            System.out.println("teenager");
        }
       */
        else{
            System.out.println("not adult");
        }
    
        // which number is larger
        System.out.println("enter the a");
        int a = sc.nextInt();
        System.out.println("enter the b");
        int b = sc.nextInt();
       if(a>b)
       {
        System.out.println("a is larger value"); /* In if statement curly baress are use in 
                                 multiple line but in single line we use curly baress or not*/
       }
       else{
        System.out.println("b is larger value");
       }
  
  // the number even or odd

     System.out.println("enter the number");
     int num = sc.nextInt();

     if (num% 2 == 0)
     {
        System.out.println("NUM IS EVEN");
     }
      else
      {
        System.out.println("NUM IS ODD");
      }
}
  }
