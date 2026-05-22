class Solution {
    public int[] replaceElements(int[] arr) {

        /*int n = arr.length;

        for (int i=0;i<n;i++){
            int max = 0;
            for (int j=i+1; j<n;j++){
                if (arr[j] > max){
                    max = arr[j];
                }
            }
            arr[i] = max;
            if (i==n-1){
                arr[i]=-1;
            }
        }
        return arr;*/

        int n = arr.length;
        int rightMax = -1;
        int [] ans = new int [n];
        for (int i= n-1;i>=0;i--){
            ans[i] = rightMax;
            rightMax = Math.max(rightMax,arr[i]);
        }
        return ans;
    }
}