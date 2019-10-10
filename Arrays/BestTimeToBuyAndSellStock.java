public class BestTimeToBuyAndSellStock {
	
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int maxProfit = maxProfit(prices);
		
		System.out.println("maxProfit : " + maxProfit);
		
	}
	
	
	
	public static int maxProfit(int[] prices) {
        
		int max=0;
		int min=Integer.MAX_VALUE;
		
		
		for(int i=0; i<prices.length; i++) {
			
			if(prices[i] < min) {
				min = prices[i];
			} else {
				max = Math.max(max, prices[i]-min);
			}
			
		}
		
		return max;
    }
}
