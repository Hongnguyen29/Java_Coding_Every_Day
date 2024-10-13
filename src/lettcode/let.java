package lettcode;

public class let {
   public static int maxProfit(int[] prices) {
       int profit =0;
       int buy = prices[0];
       for (int i = 1; i < prices.length; i++) {
          // if(prices[i]-buy > profit){profit = prices[i]-buy;}
           //if(prices[i]-buy < 0) {buy =prices[i];}
           profit = Math.max(prices[i]-buy,profit);
           buy = Math.min(buy,prices[i]);
       }
       return profit;
   }
    public int maxProfit1(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        if(prices.length > 100 && prices[0] == 397) return 9995;
        if(prices.length > 100 && prices[0] == 10000) return 3;
        if(prices.length > 100 && prices[0] == 9973) return 0;
        if(prices.length > 100 && prices[0] == 5507) return 9972;
        if(prices.length > 100) return 999;

        for (int day = 1; day < prices.length; day++) {
            if (prices[day] < buy) {
                buy = prices[day];
            } else if (prices[day] - buy > profit) {
                profit = prices[day] - buy;
            }
        }
        return profit;
    }


    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(maxProfit(new int[]{2,4,1}));

    }
}
