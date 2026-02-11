class Solution {
    public boolean isPalindrome(int n) {
        // code here
        
        int ori = n;
        int rev = 0;
        
        while(n > 0){
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }
        
        if(rev == ori) return true;
        else return false;
    }
}
