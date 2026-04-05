class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();
        int n = nums.length;
        for (int i = 0; i < n; i++){
            if (hs.contains(nums[i])){
                return true;
            }
                hs.add(nums[i]);
        }
        return false;
    }
}