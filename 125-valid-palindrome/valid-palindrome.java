import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        return isPalindromeHelper(s, 0 , s.length() -1);
    }
    private boolean isPalindromeHelper(String s, int start, int end){
        if (start>= end){
            return true;
        }
        char leftChar = s.charAt(start);
        char rightChar = s.charAt(end);

        if (!Character.isLetterOrDigit(leftChar)){
            return isPalindromeHelper(s, start+1, end);
        } else if (!Character.isLetterOrDigit(rightChar)){
            return isPalindromeHelper(s, start, end-1);
        }else{
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                return false;
            }
            return isPalindromeHelper(s, start + 1, end - 1);
        }
    }
        
}