// import java.util.Arrays;
public class h1_BasicSorting {
    // FUNCTION 1(BUBBLE SORT)
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // FUNCTION 2(SELECTION SORT)
    public static void SelectionSort(int Arr[]) {
        for (int i = 0; i < Arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[minPos] > Arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = Arr[minPos];
            Arr[minPos] = Arr[i];
            Arr[i] = temp;
        }
    }

    public static void printArr(int Arr[]) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    // FUNCTION 3(INSERTION SORT)
    public static void insertionSort(int A[]) {
        for (int i = 1; i < A.length; i++) {
            int curr = A[i];
            int prev = i - 1;
            // finding out the correct position to insert
            while (prev >= 0 && A[prev] > curr) {
                A[prev + 1] = A[prev];
                prev--;
            }
            // insertion
            A[prev + 1] = curr;

        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    // FUNCTION 4(COUNTION SORT) WAHA USE KR SKTE HAI JAHA RANGE KM HO (MTLB JAHA
    // NUMBER OF ARRAY ELEMENT KM HO )
    public static void countingSort(int ARR[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < ARR.length; i++) {
            largest = Math.max(largest, ARR[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < ARR.length; i++) {
            count[ARR[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                ARR[j] = i;
                j++;
                count[i]--;
            }
        }
        // yaha loop hamne sorting array ko print karane ke liye lagaya hai
        for (int i = 0; i < ARR.length; i++) {
            System.out.print(ARR[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubbleSort(arr);

        int Arr[] = { 6, 5, 8, 7, 2 };
        SelectionSort(Arr);
        printArr(Arr);

        int A[] = { 9, 6, 3, 4, 2 };
        insertionSort(A);

        int ARR[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countingSort(ARR);

    }

}
