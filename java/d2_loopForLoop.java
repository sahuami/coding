import java.util.*;
public class d2_loopForLoop {
       public static void main(String[] args) {
       
       for(int i =1; i<=5; i++)
       {
        System.out.println("amit");
       }
     // print square pattern using for loop
       for (int line=1; line <= 4; line++)
       {
         System.out.println("****");
       } 
        // print square pattern using WHILE loop
      int L = 1;
      while (L<=4)
      {
        System.out.println("****");
        L++;
    } 
     //print reverse of a number
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the n"); 
   int n = sc.nextInt();
  
   while(n>0)
    { int lastdigit = n%10;
        System.out.print(lastdigit);
        n = n/10;
      }
    
   
  }}




    


