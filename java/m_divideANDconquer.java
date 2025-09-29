public class m_divideANDconquer {

    // MERGE SORT

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // kaam
        int mid = si + (ei - si) / 2; // (si+ei)/2
        mergeSort(arr, si, mid); // left part (we assume it automatically sort)
        mergeSort(arr, mid + 1, ei); // right part (we assume it automatically sort)

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];

        }

        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    // QUICK SORT

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // we take last element as pivot
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // left
        quickSort(arr, pIdx + 1, ei); // right

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for element smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    // search in rotated sorted array
    public static int search(int Arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        // kaam
        int mid = si + (ei - si) / 2;
        // case found
        if (Arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if (Arr[si] <= Arr[mid]) {
            // case a: left
            if (Arr[si] <= tar && tar <= Arr[mid]) {
                return search(Arr, tar, si, mid - 1);
            } else {
                // case b: right
                return search(Arr, tar, mid + 1, ei);
            }
        }
        // mid on L2
        else {
            // case c: right
            if (Arr[mid] <= tar && tar <= Arr[ei]) {
                return search(Arr, tar, mid + 1, ei);
            } else {
                // case d:left
                return search(Arr, tar, si, mid - 1);

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 0, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);

        quickSort(arr, 0, arr.length - 1);
        printArr(arr);

        int Arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int tarIdx = search(Arr, target, 0, Arr.length - 1);
        System.out.println(tarIdx);
    }
}
