class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int max = 0;
        int curr_price;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                curr_price = prices[j] - prices[i];
                if (curr_price > max){
                    max = curr_price;
                }
            }
            
        }
        return max;
        
    }
}
