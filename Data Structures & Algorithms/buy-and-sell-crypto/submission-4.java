class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int max = 0;
        int buy = prices[0];
        int curr;
        for (int i = 1; i < n; i++){
            curr = prices[i];
            if (curr < buy){
                buy = curr;
                }
            else if(curr > max){
                max = Math.max(max,curr-buy);
            }
        }
        return max;
        
        
        
        
        /*int profit;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                profit = prices[j] - prices[i];
                if (profit > max){
                    max = profit;
                }
            }
            
        }
        return max;*/
        
    }
}
