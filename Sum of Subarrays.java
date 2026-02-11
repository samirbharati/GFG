class Solution {
    public int subarraySum(int[] arr) {
        // code here
        int n = arr.length;
        
        int total_sum = 0;
        
        for(int i=0; i<n; i++){
            int cur_sum = 0;
            for(int j=i; j<n; j++){
                cur_sum += arr[j];
                total_sum += cur_sum;
            }
        }
        
        return total_sum;
    }
}
