class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        
        long total_sum = (long)(n+1)*(n+2)/2;
        
        Arrays.sort(arr);
        
        long cur_sum = 0;
        for(int i=0; i<n; i++){
           cur_sum += arr[i]; 
        }
        
        return (int)(total_sum - cur_sum);
    }
}
