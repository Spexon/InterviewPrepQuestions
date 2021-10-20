public class MaxProfit {

  public int maxProfit(int[] prices) {
    int profit = 0;
    int smallest = prices[0];
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < smallest) {
        smallest = prices[i];
      }

      if (profit < prices[i] - smallest && prices[i] != smallest) {
        profit = prices[i] - smallest;
      }

    }

    return profit;
  }

}
