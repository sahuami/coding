public class Q6WhatWillBeTheOutput 
{
    public static void main(String[] args) 
    {
        int x  = 2, y = 5;
        
        int exp1 = (x*y/x);
        int exp2 = (x*y/x);

        System.out.println(exp1 +",");
        System.out.println(exp2);


        int a, b, c; // int shows integer type value but float shows decimal(actual) value.
        a= b = c = 2;
        a += b; // a = a+b
        b -= c; // b = b - c
        c /= (a + b); // c = c/(a+b)
        System.out.println(a + " " + b + " " + c);
      
      
      

     int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
     System.out.println(exp);


    }



}
