package Accepted;

public class No121动态规划 {
    public int maxProfit(int[] prices) {
        if(prices.length==1){return 0;}
        int Min =prices[0];
        int LocalMax =prices[1]-prices[0];
        for (int price : prices) {
            if (price < Min) {
                Min = price;
            } else if (price - Min >= LocalMax) {
                LocalMax = price - Min;
            }
        }
        return Math.max(LocalMax, 0);

    }
}
