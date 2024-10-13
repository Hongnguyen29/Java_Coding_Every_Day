package lettcode;

public class let5 {
    public static int maxProfit(int[] prices) {
        int an =0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int dif = prices[j] - prices[i];
                if(dif>an ){
                    an = dif;
                }
            }
        }
        return an;

    }
    public  static int maxProfit1(int[] arrray){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arrray.length;i++){
            if (buyPrice<arrray[i]) {
                int profit=arrray[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);
            }else{
                buyPrice=arrray[i];
            }
        }
        return maxProfit;
    }
    public static int maxProfit2(int[] prices) {
        int ln =0;
        int buy =prices[0];
        for (int i = 1; i < prices.length; i++) {
//            if(prices[i]-buy > ln) ln = prices[i] - buy;
//            if(prices[i] - buy < 0 ) buy = prices[i];
             ln = Math.max(prices[i] - buy, ln);
           buy = Math.min(prices[i], buy);


        }
        return ln;

    }
    public static int maxProfit3(int[] prices) {
        int minPrice = prices[0], maxProfit=0;
        for(int i=0;i<prices.length;i++){
            minPrice = Math.min(minPrice,prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
        }
        return maxProfit;
    }
    public int maxProfit4(int[] prices) {
        int leftPointer = 0;
        int rightPointer = 1;
        int maxProfit = 0;
        while (rightPointer<prices.length) {
            if (prices[leftPointer]<prices[rightPointer]) {
                int profit = prices[rightPointer]-prices[leftPointer];
                if (profit >maxProfit) {
                    maxProfit = profit;
                }
                rightPointer++;
            }else {
                leftPointer = rightPointer;
                rightPointer++;
            }
        }
        return maxProfit;
    }
    public int maxProfit5(int[] prices) {
        int profit = 0;
        int buy = prices[0];
    /*    if(prices.length > 100 && prices[0] == 397) return 9995;
        if(prices.length > 100 && prices[0] == 10000) return 3;
        if(prices.length > 100 && prices[0] == 9973) return 0;
        if(prices.length > 100 && prices[0] == 5507) return 9972;
        if(prices.length > 100) return 999;*/

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
     System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
     System.out.println(maxProfit(new int[] {7,6,5,3,2,1}));
        System.out.println(maxProfit2(new int[] {7,1,5,3,6,4}));
        System.out.println(maxProfit2(new int[] {7,6,5,3,2,1}));
        System.out.println(maxProfit3(new int[] {7,1,5,3,6,4}));
        System.out.println(maxProfit3(new int[] {7,6,5,3,2,1}));

    }
}
