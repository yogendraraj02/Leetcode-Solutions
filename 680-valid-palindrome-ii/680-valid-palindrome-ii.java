class Solution {
    public boolean isPalindromeHelper(String s ,int i,int j){
        
        while(i < j && s.charAt(i) == s.charAt(j)){
            i++;
            j--;
        } 
        return i >= j; 
    }
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i < j && s.charAt(i) == s.charAt(j)){
            i++;
            j--;
        }
        if(i >= j)  return true;
        return isPalindromeHelper(s,i+1,j) || isPalindromeHelper(s,i,j-1);

    }
}