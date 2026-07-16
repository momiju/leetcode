class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);   // 숫자 -> 문자열
        String reversed = "";

        for(int i=s.length()-1;i>=0;i--){
            reversed = reversed+s.charAt(i);
        }

        return s.equals(reversed);
    }
}