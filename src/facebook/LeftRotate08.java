package facebook;

public class LeftRotate08 {
	
	// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int size = a.length;
        int[] rotatedArr = new int[size];

        int i=0;
        int rotatedIndex = d;

        while(rotatedIndex < size){
            rotatedArr[i] = a[rotatedIndex];
            i++;
            rotatedIndex++;
        }

        rotatedIndex=0;
        while(rotatedIndex < d){
            rotatedArr[i] = a[rotatedIndex];
            i++;
            rotatedIndex++;
        }

        return rotatedArr;

    }
    
   
    
}
