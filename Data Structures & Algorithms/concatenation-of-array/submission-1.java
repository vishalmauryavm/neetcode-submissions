class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int [] res = new int[2*n];
        int j = 0;
        int i = 0;
        while (j < (2*n)){
            res[j] = nums[i];
            i++;
            j++;
            if (i == n){   
                i = 0;
            }
        }
      return res;  
    }
}