package Matrix;

import java.util.ArrayList;
import java.util.List;

public class spiralMartix {
public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
    
        if(matrix.length == 0){
            return result;
        }
        
        int rowB=0;
        int rowE=matrix.length-1;
        int colB=0;
        int colE=matrix[0].length-1;
        
        while(rowB <= rowE && colB <= colE){
            
            for(int i=colB; i<=colE; i++){
                result.add(matrix[rowB][i]);
            }
            
            rowB++;
            
            for(int i=rowB; i<=rowE; i++){
                result.add(matrix[i][colE]);
            }
            
            colE--;
                
            if(rowB <= rowE){
               for(int i=colE; i>=colB; i--){
                  result.add(matrix[rowE][i]); 
               } 
            }
              
            rowE--;
                
            if(colB<=colE){
                for(int i=rowE; i>=rowB; i--){
                  result.add(matrix[i][colB]);  
                }
            }
                
            colB++;
        }
        
        return result;
    }

}
