package Algorithm.Sorting;

public class QS{
    static void quick(int arr[], int lb, int ub) {
        int loc = 0;
        if (lb < ub) {
            loc = partition(arr, lb, ub);
            quick(arr, lb, loc - 1);
            quick(arr, loc + 1, ub);
        }
    }

    static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[ub];
        int i = lb - 1;
        for (int j = lb; j <= ub - 1; j++) {

            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[ub];
        arr[ub] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        System.out.println("Elements in array before sorting: ");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println("\n ");
        int n = arr.length;
        quick(arr, 0, n - 1);
        System.out.println("Elements in array after sorting: ");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println("\n ");
    }
}