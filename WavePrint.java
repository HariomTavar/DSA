import java.util.ArrayList;
import java.util.List;


public class WavePrint {
    public List<Integer> wavePrintArray(int [][] Matrix,int n ,int m){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ( (i&1)==1){

            for(int j = -1; j>=0;j--){
                result.add(Matrix[j][i]);
            }
            }
else{
for (int j = 0; j < n; j++) {
    result.add(Matrix[j][i]);
}
}
        }
return result;
            
        
    }
    public static void main(String[] args) {
        
    }
}
