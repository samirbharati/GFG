class Solution {
    static void quickSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }

        int pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int pi = low;

        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, pi);
                pi++;
            }
        }

        swap(arr, pi, high);

        return pi;
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
