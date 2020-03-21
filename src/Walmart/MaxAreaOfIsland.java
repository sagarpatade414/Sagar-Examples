package Walmart;

public class MaxAreaOfIsland {
	
	 public static int maxAreaOfIsland(int[][] grid) {
	        int maxAreaOfIsland = 0;
	        
	        if(grid == null || grid.length<=0){
	            return maxAreaOfIsland;
	        }
	        
	        for(int i=0; i<grid.length; i++){
	            for(int j=0; j<grid[i].length; j++){
	                if(grid[i][j] == 1){
	                    maxAreaOfIsland = Math.max(maxAreaOfIsland, dfs(grid, i, j));
	                }
	            }
	        }
	        
	        return maxAreaOfIsland;
	    }
	    
	    private static int dfs(int[][] grid, int i, int j){
	        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == 0){
	            return 0;
	        }
	        
	        grid[i][j] = 0;
	        int count = 1;
	        
	        count += dfs(grid, i+1, j);
	        count += dfs(grid, i-1, j);
	        count += dfs(grid, i, j+1);
	        count += dfs(grid, i, j-1);
	        
	        return count;
	    }
	
	public static void main(String[] args) {
		int[][] arr = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
		               {0,0,0,0,0,0,0,1,1,1,0,0,0},
		               {0,1,1,0,1,0,0,0,0,0,0,0,0},
		               {0,1,0,0,1,1,0,0,1,0,1,0,0},
		               {0,1,0,0,1,1,0,0,1,1,1,0,0},
		               {0,0,0,0,0,0,0,0,0,0,1,0,0},
		               {0,0,0,0,0,0,0,1,1,1,0,0,0},
		               {0,0,0,0,0,0,0,1,1,0,0,0,0}};
		            		   
		int ShortestDis = maxAreaOfIsland(arr);
		System.out.println(ShortestDis);
	}
}
