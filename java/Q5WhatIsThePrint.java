public class Q5WhatIsThePrint {
     public static void main(String[] args)
         
     {
        int x = 200, y = 50, z = 100;
            if(x > y && y > z)
            {System.out.println("Hello");} // this is not print bcz both are true
            if(z > y && z < x)
            {System.out.println("Java");} //  this is print bcz both are true
            
            if((y+200) < x && (y+150) < z)
            {System.out.println("Hello Java");}// this is not print bcz both are true
            
     }
    }


