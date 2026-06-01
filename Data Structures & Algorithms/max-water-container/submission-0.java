class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int maxArea =0;
        int maxheight =0;
        int res =0;
        int i=0;
        int j=n-1;
        while(i<j){
            maxheight=Math.min(heights[i],heights[j]); 
            maxArea=maxheight*(j-i);
            res= Math.max(res,maxArea);
            if(heights[i]>heights[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return res;
    }
}
