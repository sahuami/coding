import java.util.*;

public class i_string {

    // FUNCTION
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    // FUNCTION(palindrome)
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // FUNCTION(SHORTEST PATH)
    public static float getShortestpath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if (dir == 'S') {
                y--;
            }
            // north
            else if (dir == 'N') {
                y++;
            }
            // west
            else if (dir == 'W') {
                x--;
            }
            // east
            else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    // FUNCTION(SUB STRING)
    public static String subString(String s, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += s.charAt(i);
        }
        return substr;
    }

    // FUNCTION (FIRST LETTER CONVERT TO UPPERCASE)
    public static String toUpperCase(String st) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(st.charAt(0));
        sb.append(ch);

        for (int i = 1; i < st.length(); i++) {
            if (st.charAt(i) == ' ' && i < st.length() - 1) {
                sb.append(st.charAt(i));
                i++;
                sb.append(Character.toUpperCase(st.charAt(i)));
            } else {
                sb.append(st.charAt(i));
            }
        }
        return sb.toString();
    }

    // FUNCTION(String Compression)
    public static String compress(String STR) {
        String newSTR = "";

        for (int i = 0; i < STR.length(); i++) {
            Integer count = 1;
            while (i < STR.length() - 1 && STR.charAt(i) == STR.charAt(i + 1)) {
                count++;
                i++;
            }
            newSTR += STR.charAt(i);
            if (count > 1) {
                newSTR += count.toString();
            }
        }
        return newSTR;
    }

    public static void main(String[] args) {
        // java strings are immutable
        // char arr[] = { 'a', 'b', 'c', 'd' };
        String str1 = "abcd";
        String str2 = new String("xyz@12342345");

        String concet = str1 + str2;
        System.out.println(concet);

        // string input from user
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        // find length of string
        String fullName = "Tony stark";
        System.out.println(fullName.length());

        // concatenation(combination of string)
        String firstName = "amit";
        String lastName = "sahu";
        String FullName = firstName + " " + lastName;
        System.out.println(FullName);
        System.out.println(FullName.length());
        System.out.println(FullName.charAt(0));

        printLetters(FullName);

        // FUNCTION(palindrome)
        String str = "racecar";
        System.out.println(isPalindrome(str));

        // FUNCTION(SHORTEST PATH)
        String path = "WNEENESENN";
        System.out.println("shortest path is :" + getShortestpath(path));

        // COMPARE STRING
        String S1 = "Tony";
        String S2 = "Tony";
        String S3 = new String("Tony");

        if (S1 == S2) { // yaha par dono equal show karege kyuki s2 jo hai vo puri s1 value ko he point
                        // kr rah hoga
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        // if(S1 == S3)
        // {
        // System.out.println("String are equal");
        // }
        // else{
        // System.out.println("String are mot equal");
        // }

        
        if (S1.equals(S3)) // String ko campare krne ke liye "==" ka use ni krte uske liye ".equals" ka use
                           // krte hai kyuki jb bhi hum new keyword ke sath nai string bnante hai toh vo
                           // purani wali value ko show nhi krta vo ek new string show krta hai
        {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        // FUNCTION(SUB STRING)
        String s = "Helloworld";
        System.out.println(subString(s, 0, 5));

        // java ke andar substring function inbuilt hota isliye logically code likhne se
        // acha hai uska he use kro

        String S = "SAHAMI";
        System.out.println(S.substring(0, 5));

        // LARGEST STRING (LEXICOGRAPHY)
        String Fruit[] = { "apple", "mango", "banana" };
        String Largest = Fruit[0];
        for (int i = 0; i < Fruit.length; i++) {
            if (Largest.compareTo(Fruit[i]) < 0) {
                Largest = Fruit[i];
            }
        }
        System.out.println(Largest);

        // String Builder(".toString()" kisse bhi object ko string me convert kr deta
        // hai jaise int ko String , char ko String me or bhi)
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // append ki help se sare characteer ek ek krke judte jayge or fir hum finally
                           // orint kra lenge
        }
        System.out.println(sb);
        System.out.println(sb.length());

        // StringBuffer : in Java is a class used to create mutable (modifiable) strings.
        // It is similar to StringBuilder but is synchronized, which means it's safe to
        // use in multi-threaded environments where multiple threads may be accessing
        // and modifying the same StringBuffer object concurrently
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World"); // Append " World" to the existing string
        System.out.println(stringBuffer.toString()); // Output: Hello World

        // FUNCTION (FIRST LETTER CONVERT TO UPPERCASE)
        String st = "hi, i am sahami";
        System.out.println(toUpperCase(st));

        // FUNCTION(String Compression)
        String STR = "aaabbcccdd";
        System.out.println(compress(STR));

    }
}
