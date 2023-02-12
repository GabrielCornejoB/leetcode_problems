// https://leetcode.com/problems/palindrome-number/description/

class Solution {
    public boolean isPalindrome(int x) {
        int originalNumber = x;
        int lastDigit = x % 10;
        int reversedNumber = 0;

        if (x < 0) {
            return false;
        }

        while(originalNumber > 0) {
            reversedNumber = (reversedNumber * 10) + lastDigit;
            originalNumber = originalNumber / 10;
            lastDigit = originalNumber % 10;
        }

        return x == reversedNumber;  
    }
}