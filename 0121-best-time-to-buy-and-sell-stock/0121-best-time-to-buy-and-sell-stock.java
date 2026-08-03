class Solution {
    public int maxProfit(int[] prices) {
        // int m_profit = 0;
        // for (int buy = 0; buy < prices.length; buy++){
        //     for (int sell = buy+1; sell < prices.length; sell++){
        //         if((prices[sell]-prices[buy]) > m_profit){
        //             m_profit = prices[sell]-prices[buy];
        //         }
        //     }
        // }
        // return m_profit;

        // int min=prices[0];
        // int max=prices[0];
        // int min_index=0;
        // for (int i =0; i<prices.length;i++){
        //     if (prices[i]<min){
        //         min=prices[i];
        //         min_index=i;
        //     }
        // }
        // for (int i = min_index+1; i<prices.length;i++){
        //     if (prices[i]>max){
        //         max=prices[i];
        //     }
        // }
        // return max-min;



        int min = prices[0];
        int m_profit = 0;
        
        for (int i = 0; i<prices.length;i++){
            if (m_profit < prices[i]-min){
                m_profit = prices[i]-min;
            }
            if (min> prices[i]){
                min = prices[i];
            }
        }
        return m_profit;
    }
}