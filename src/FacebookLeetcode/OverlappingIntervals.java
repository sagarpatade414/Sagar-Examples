package FacebookLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingIntervals {
	
	public static int[][] merge(int[][] intervals) {
		
		if(intervals.length <= 1) {
			return intervals;
		}
		
		Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
		
		List<int[]> result = new ArrayList<>();
		
		
		int[] newInterval = intervals[0];
		result.add(newInterval);
		
		for(int[] interval:intervals) {
			System.out.println("interval[0] : " + interval[0]);
			System.out.println(" newInterval[1] : " +  newInterval[1]);
			System.out.println(" interval[1] : " +  interval[1]);
			if(interval[0] <= newInterval[1]) {
				newInterval[1] = Math.max(interval[1], newInterval[1]);
				System.out.println(" newInterval[1] In if : " +  newInterval[1]);
			} else {
				newInterval = interval;
				result.add(newInterval);
			}
		}
		
		return result.toArray(new int[(result.size())][]);
		
	}
	
	
	public static void main(String[] args) {
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] intervalsMerge = merge(intervals);
		
		for(int[] interval : intervalsMerge) {
			System.out.println(Arrays.toString(interval));
		}
	}
}
