public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;
        for(int i = 0; i<prices.length-1; i++){
            profit = prices[i+1] - prices[i];
            if(profit > 0)
                maxProfit += profit;
        }
        return maxProfit;
    }
}