package facebook;

public class MaxNumberofToys10 {
	
	// Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int count=0;
        

        if(prices.length <=0 || k==0){
            return count;
        }

        for(int i=0; i<prices.length; i++){
            k -= prices[i];
            if(k<0){
               return count; 
            }
            count++;
        }

        return count;
    }
}
