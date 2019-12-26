package Random;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class SortCharactersByFrequency {
	

	public static void main(String[] args) {
		String str = "loveleetcode";
		String indexValue = frequencySort(str);
		System.out.println("indexValue : " + indexValue);
	}
	
	public static String frequencySort(String s) {
		Map<Character, Integer> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
		
        for(Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = 
            new PriorityQueue<>((e1, e2) -> e2.getValue()-e1.getValue());
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }
        
        while(!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> current = maxHeap.poll();
            char character = current.getKey();
            int count = current.getValue();
			
            while(count > 0) {
                str.append(character);
                count--;
            }
        }
        
        return str.toString();
	}

}
