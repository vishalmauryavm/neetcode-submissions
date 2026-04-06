class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        int array [] = new int [26];

        for(int i = 0; i < s.length(); i++){
            array[s.charAt(i) - 'a']++;
            array[t.charAt(i) - 'a']--;
        }

        for (int a : array){
            if (a != 0){
                return false;
            }
        }
        return true;
        /*char arr[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);
        return Arrays.equals(arr,arr2);*/

    }
}
