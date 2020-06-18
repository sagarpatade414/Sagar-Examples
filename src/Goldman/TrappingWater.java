package Goldman;

public class TrappingWater {
	
	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int trap = trap(height);
		
		System.out.println("Amount of water able to trap : " + trap);
	}
	
	public static int trap(int[] height) {
        
        if(height == null || height.length == 0){
            return 0;
        }
        
        int res=0;
        int level=0;
        int left=0;
        int right=height.length-1;
        
        while(left<right){
            int lower = height[ height[left] < height[right] ? left++: right--];
            level = Math.max(level, lower);
            res += level-lower;
        }
        
        return res;
    }

}
