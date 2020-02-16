package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        
        if(strs.length == 0){
            return res;
        }
        
        Map<String, List<String>> hmap = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            String str = strs[i];
            char[] strChar = str.toCharArray();
            Arrays.sort(strChar);
            
            String strBack = String.valueOf(strChar);
            
            hmap.putIfAbsent(strBack, new ArrayList<String>());
            hmap.get(strBack).add(str);
        }
        
        for(String str :hmap.keySet()){
            res.add(hmap.get(str));
        }
        
        return res;
    }
}
