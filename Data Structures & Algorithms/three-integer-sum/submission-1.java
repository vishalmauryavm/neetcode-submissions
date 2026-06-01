class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int k=0;k<n-2;k++){
        int target = -nums[k]; 
        if(k>0 && nums[k]==nums[k-1]){
            continue;
        }
        int i=k+1;
        int j=n-1;
            while (i<j){
                if(nums[i] + nums[j]==target){
                list.add(Arrays.asList(nums[k],nums[i],nums[j]));
                i++;
                j--;

                while (i<j && nums[i]==nums[i-1]){
                    i++;
                }
                while (i<j && nums[j]==nums[j+1])
                    j--;
                }
                else if(nums[i] + nums[j] > target){
                j--;
                }
                else {
                i++;
                }
            }
        } 
        return list;
    }
}
