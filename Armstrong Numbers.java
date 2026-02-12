class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int ori = n;
        
        while(n != 0){
            int rem = n % 10;
            sum += (rem * rem * rem);
            n = n / 10;
        }
        
        if(sum == ori) return true;
        else return false;
    }
}
