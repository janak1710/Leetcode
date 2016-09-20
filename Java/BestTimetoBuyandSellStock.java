public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
        int minBuyPrice = prices[0];
        int maxProfit = 0;
        int curProfit = 0;
        for(int i = 1; i<prices.length; i++){
            curProfit = prices[i] - minBuyPrice;
            if(curProfit > maxProfit)
                maxProfit = curProfit;
            if(prices[i] < minBuyPrice)
                minBuyPrice = prices[i];
        }
        return maxProfit;
    }
}