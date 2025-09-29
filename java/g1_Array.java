import java.util.Scanner;

public class g1_Array {
 
  // FUNCTION 1
  public static void update(int Marks[]) {
    for (int i = 0; i < Marks.length; i++) {
      Marks[i] = Marks[i] + 1;
    }

    // ek ek krke marks primt karane se acha for loop lga dete hai firse
    for (int i = 0; i < Marks.length; i++) {
      System.out.println("updated marks : " + Marks[i]);
    }
  }

  // FUNCTION 2(linearSearch)
  public static int linearSearch(int number[], int key) {
    for (int i = 0; i < number.length; i++) {
      if (number[i] == key)
        return i;
    }
    return -1;
  }

  // FUNCTION 3(BinarySearch)
  public static int BinarySearch(int numb[], int Key) {
    int start = 0, end = numb.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (numb[mid] == Key) {
        return mid;
      }
      if (numb[mid] < Key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;

  }

  // FUNCTION 4(FIND LARGEST/SMALLEST NUMBER)
  public static int largest(int num[]) {
    int largest = Integer.MIN_VALUE; // -infinity
    int smallest = Integer.MAX_VALUE; // +infinity
    for (int i = 0; i < num.length; i++) {
      if (largest < num[i]) {
        largest = num[i];
      }
      if (smallest > num[i]) {
        smallest = num[i];
      }
    }
    System.out.println("smallest value : " + smallest);
    return largest;
  }

  // FUNCTION 5(REVERSE AN ARRAY)
  public static void reverse(int numbe[]) {
    int first = 0, last = numbe.length - 1;
    while (first < last) {
      // swap
      int temp = numbe[last];
      numbe[last] = numbe[first];
      numbe[first] = temp;
      first++;
      last--;
    }
  }

  // FUNCTION 6(PAIRS OF AN ARRAY)
  public static void printpairs(int numbs[]) {
    int TP = 0;   // tp means total pairs
    for (int i = 0; i < numbs.length; i++) {
      int current = numbs[i];
      for (int j = i + 1; j < numbs.length; j++) {
        System.out.print("(" + current + "," + numbs[j] + ")");
        TP++;
      }
      System.out.println();

    }
    System.out.println("total pairs is :" + TP);
  }

  // FUNCTION 7(PRINT SUB ARRAY)
  public static void printSubarray(int Number[]) {
    int TS = 0;  // ts means total subpairs
    for (int i = 0; i < Number.length; i++) {
      int start = i;
      for (int j = i; j < Number.length; j++) {
        int end = j;
        for (int k = start; k <= end; k++) {
          System.out.print(Number[k] + " ");
        }
        TS++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total subarray  =" + TS);
  }

  
  public static void main(String[] args) {
    int marks[] = new int[10]; // create array : int number[] = {1,2,3} and String fruits[] = {"apple",
                               // "mongo", "orange"} is is tarike se array create kr skte hai
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the phy marks");
    marks[0] = sc.nextInt();
    System.out.println("enter the chem marks");
    marks[1] = sc.nextInt();
    System.out.println("enter the math marks");
    marks[2] = sc.nextInt();

    System.out.println("phy :" + marks[0]);
    System.out.println("chem :" + marks[1]);
    System.out.println("math :" + marks[2]);

    // marks[2] = 99; // yaha humne value(marks[2]) update ki hai
    // System.out.println("math :"+ marks[2]);

    int percentage = (marks[0] + marks[1] + marks[2]) / 3;
    System.out.println("percentage :" + percentage + "%");

    // size(length) of array
    System.out.println("size of array: " + marks.length);

    // FUNCTION 1
    int Marks[] = { 97, 87, 76 };
    update(Marks);

    // FUNCTION 2(linearSearch)
    int number[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
    int key = 10;
    int index = linearSearch(number, key);
    if (index == -1) {
      System.out.println(" KEY NOT FOUND");
    } else {
      System.out.println("key is at index : " + index);
    }

    // FUNCTION 3(BinarySearch: binary search work only sorted array)
    int numb[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, };
    int Key = 7;
    System.out.println("index for key is :" + BinarySearch(numb, Key));

    // FUNCTION 4(FIND LARGEST/SMALLEST NUMBER)
    int num[] = { 1, 2, 6, 4, 7, 5 };
    System.out.println("largest value : " + largest(num));

    // FUNCTION 5(REVERSE AN ARRAY)
    int numbe[] = { 1, 2, 3, 4, 5, 6, 7, 8, };
    reverse(numbe);
    System.out.println("reverse of array is");
    for (int i = 0; i < numbe.length; i++) {
      System.out.print(numbe[i] + " ");
    }
    System.out.println();

    // FUNCTION 6(PAIRS OF AN ARRAY)
    int numbs[] = { 2, 4, 6, 8, 10 };
    printpairs(numbs);

    // FUNCTION 7(PRINT SUB ARRAY)
    int Number[] = { 2, 4, 6, 8, 10 };
    printSubarray(Number);

  }

}
