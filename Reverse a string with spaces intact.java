class Solution {
    String reverseWithSpacesIntact(String S) {
        // your code here
        char[] arr = S.toCharArray();
        int left = 0;
        int right = arr.length-1;
        
        while(left < right){
            if(arr[left] == ' ') left++;
            else if(arr[right] == ' ') right--;
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
