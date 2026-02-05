class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int largest = arr[n - 1];
        
        // Traverse from second last element backward
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }
        
        return -1; // No second largest found
    }
}   
