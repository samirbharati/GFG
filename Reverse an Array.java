class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int f = 0;
        int l = arr.length-1;
        
        while(f<l){
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            
            f++;
            l--;
        }
        
        Arrays.toString(arr);
    }
}
