class Solution {
    public boolean isPalindrome(int x) {
        String xStrValue = String.valueOf(x);
        int totalXStrLength = xStrValue.length();
        for(int i = 0; i < totalXStrLength / 2; i++) {
            char firstChar = xStrValue.charAt(i);
            char lastChar = xStrValue.charAt(totalXStrLength - 1 - i);
            if(firstChar != lastChar) return false;
        }
        return true;
    }
}