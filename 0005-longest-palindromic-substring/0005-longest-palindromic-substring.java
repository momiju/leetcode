class Solution {
    public String longestPalindrome(String s) {
        String answer="";

        for(int i=0;i<s.length();i++){
            // even
            int left = i;
            int right = i+1;

            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1 > answer.length()){
                    answer = s.substring(left, right+1);
                }

                left--;
                right++;
            }

            // odd
            left = i;
            right = i;

            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1 > answer.length()){
                    answer = s.substring(left, right+1);
                }

                left--;
                right++;
            }
        }
        return answer;
    }
}