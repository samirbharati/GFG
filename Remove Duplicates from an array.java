class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        Set<Integer> set = new LinkedHashSet<>();
        
        for(int num : arr){
            set.add(num);
        }
        
        return new ArrayList<>(set);
    }
}
