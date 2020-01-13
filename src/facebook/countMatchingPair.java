package facebook;

import java.util.Arrays;

public class countMatchingPair {
	
	public static int numberPairs(int n, int[] ar) {
        int pairCount=0;
        
        Arrays.sort(ar);
        
        for(int i=0; i<ar.length-1;i++) {
        	System.out.println("before i: " + i);
        	System.out.println("before a[i]: " + ar[i]);
        	System.out.println("before a[i]: " + ar[i+1]);
        	if(ar[i] == ar[i+1]){
        		pairCount++;
        		i=i+1;
        		System.out.println("after i: " + i);
        	}
        }
        
        
        return pairCount;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,1,2,1,3,2};
		//int[] arr = {10,20,20,10,10,30,50,10,20};
		int result = numberPairs(arr.length, arr);
		System.out.println("result : " + result);
	}
}
