package Goldman;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class HighFive {
	
	public static void main(String[] args) {
		int[][] items = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
		
		int[][] highFive = highFive(items);
		
		System.out.println(highFive);
	}
	
	public static int[][] highFive(int[][] items) {
        
        Map<Integer, PriorityQueue<Integer>> treeMap = new TreeMap<>();
        
        for(int[] item: items){
            int id = item[0];
            int score = item[1];
            
            if(treeMap.containsKey(id)){
                PriorityQueue<Integer> heap = treeMap.get(id);
                heap.offer(score);
                
                if(heap.size() > 5){
                    heap.poll();
                }
                
                treeMap.put(id, heap);
            } else {
                 PriorityQueue<Integer> heap = new PriorityQueue<>();
                 heap.offer(score);   
                 treeMap.put(id, heap);
            }
        }
        
        int[][] result = new int[treeMap.size()][2];
        
        for(int id: treeMap.keySet()){
            
            PriorityQueue<Integer> heap = treeMap.get(id);
            int sum=0;
            
            while(!heap.isEmpty()){
                sum += heap.poll();
            }
            
            result[id - 1][0] = id;
            result[id - 1][1] = sum/5;   
        }
        
        return result;
    }
}
