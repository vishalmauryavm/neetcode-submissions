class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        int i=s.length()-1;
        int j=t.length()-1;
        while (i>=0 && j>=0){
            if (s.charAt(i)== t.charAt(j)){
                count++;
                i--;
                j--;
            }
            else {
                j--;
            }
        }
        if (count==s.length()){
            return true;
        }
        return false;
    }
}