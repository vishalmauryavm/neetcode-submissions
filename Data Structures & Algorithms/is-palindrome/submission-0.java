class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n = s1.length()-1;
        int i = 0;
        int j = n;
        int count = 0;
        while (i < j){
            if (s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
