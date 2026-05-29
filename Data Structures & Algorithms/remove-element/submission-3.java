class Solution {
    public int removeElement(int[] nums, int val) {
        /*int n = nums.length;
        int count=n;
        for (int i=0;i<n;i++){
            if(nums[i]==val){
                count--;
                nums[i]=Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);
        return count;*/

        int n = nums.length;
        int i=0;
        for (int j=0;j<n;j++){
            if (nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}