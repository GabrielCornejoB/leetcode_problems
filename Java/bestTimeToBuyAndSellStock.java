// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class bestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        // Points to buy day
        int left = 0;
        // Points to sell day
        int right = 1;
        int maxProfit = 0;

        while (right < prices.length) {
            // Changes maxProfit if currentProfit is bigger
            if (prices[left] < prices[right]) maxProfit = Math.max(maxProfit, prices[right] - prices[left]);  
            // if there's no profit, it's cheaper, so change buyDay
            else left = right;     
            // Increment to check next day 
            right += 1;
        }
        return maxProfit;
    }
}
