
public class l_recursion {

    // print number in decresing order
    public static void printdec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printdec(n - 1);
    }

    // print number in increasing order
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // factorial
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fact_n_minus_1 = fact(n - 1);
        int factof_n = n * fact(n - 1);
        return factof_n;
    }

    // print sum of n natural number
    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = calcSum(n - 1);
        int Sn = n + Snm1;
        return Sn;

    }

    // fibonacci number
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // check array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    // first occurence of an element in an array
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    // last occurence of an element in an array
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;

    }

    // print x power n (1st method)
    public static int power(int x, int N) {
        if (N == 0) {
            return 1;
        }

        // int xNm1 = power(x, N-1);
        // int xN = x* xNm1;
        // return xN; is pure ko single line m bhi likh skte hai recursion m

        return x * power(x, N - 1);
    }

    // print x power n (2nd method)
    public static int optimizedPower(int a, int m) {
        if (m == 0) {
            return 1; 
        }

        int halfPowerSq = optimizedPower(a, m / 2) * optimizedPower(a, m / 2);

        // m is odd
        if (m % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    // tilling problem
    public static int tillingProblem(int n) {
        // 2*n (floor size)
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // verticle choice
        int fnm1 = tillingProblem(n - 1);

        // horizontal choice
        int fnm2 = tillingProblem(n - 2);

        int totalways = fnm1 + fnm2;
        return totalways;
    }

    // remove duplicate of string
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a'] == true) {
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[currentChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currentChar), map);
        }
    }

    // pairing friend
    public static int friendPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // choice
        // single
        int fnm1 = friendPairing(n - 1);

        // pair
        int fnm2 = friendPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // totalWays
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }

    // binary string problem(without consecutive ones)
    public static void printBinaryString(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;

        }

        // kaam
        printBinaryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 8;
        printdec(n);

        printInc(n);

        System.out.println(fact(n));

        System.out.println(calcSum(n));

        System.out.println(fib(n));

        int arr[] = { 1, 2, 5, 4, 7, 3, 5, 6 };
        System.out.println(isSorted(arr, 0));

        System.out.println(firstOccurence(arr, 5, 0));

        System.out.println(lastOccurence(arr, 5, 0));

        System.out.println(power(2, 3));

        System.out.println(optimizedPower(2, 3));

        System.out.println(tillingProblem(4));

        String str = "appnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);

        System.out.println(friendPairing(3));

        printBinaryString(3, 0, "");
    }
}
