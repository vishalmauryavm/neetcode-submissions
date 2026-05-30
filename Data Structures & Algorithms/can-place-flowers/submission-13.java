class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while (i<flowerbed.length && n>0){
            if(flowerbed[i]==1){
                i+=2;
            }
            else{
                boolean left = (i==0) || flowerbed[i-1]==0;
                boolean right = (i==flowerbed.length-1) || flowerbed[i+1]==0;
                if (left && right){
                    flowerbed[i]=1;
                    n--;
                    i+=2;
                }
                else {
                i++;
            }
            }
            
        }
        return n==0;
    }
}