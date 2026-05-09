class Solution {
    public int search(int[] nums, int target) {

        int s = nums.length;
        int l = 0;
        int h = s - 1;
        while (h >= l){
            int m = (h+l)/2;
            if (nums[m] == target){
                return m;
            }
            else if (nums[m] > target){
                h = m - 1;
            }
            else if (nums[m] < target){
                l = m + 1;
            }
        }
        return -1;
    }
}
