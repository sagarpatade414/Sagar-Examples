package FacebookLeetcode;

import java.util.PriorityQueue;

public class KClosest {
	
	public static int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>( (a,b) -> ( (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1])));
        
        for(int[] point : points){
            maxHeap.add(point);
            if(maxHeap.size() > K){
                maxHeap.remove();
            } 
        }
        
        int[][] result = new int[K][2];
        
        while(K-- > 0){
           result[K] = maxHeap.remove();
        }
        
        return result;
    }
	
	public static void main(String[] main){
    	int K = 1; 
    	int[][] points = {{1,3},{-2,2}};
    	int[][] minRemoveToMakeValid = kClosest(points, 1);
    	System.out.println("minRemoveToMakeValid : " + minRemoveToMakeValid);
    }
}
