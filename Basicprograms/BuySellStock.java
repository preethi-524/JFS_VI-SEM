class BuySellStock{
    public int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if (price < minPrice)
                minPrice = price;
            else 
                maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
    public static void main(String[]args){
        BuySellStock obj = new BuySellStock();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int profit = obj.maxProfit(prices);
        System.out.println(profit);
    }
}