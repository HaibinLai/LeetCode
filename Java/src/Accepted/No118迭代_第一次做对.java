package Accepted;

import java.util.ArrayList;
import java.util.List;

public class No118迭代_第一次做对 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Ans =new ArrayList<>();
        Ans.add(Gen(1, null));
        for(int i=1;i<numRows;i++){
            Ans.add(Gen(i+1,Ans.get(i-1)));
        }

        return Ans;

    }
    public static List<Integer> Gen(int col,List<Integer> B){
        List<Integer> C =new ArrayList<>();
        if(col==1){C.add(1);return C;}
        C.add(1);
        for(int i=1;i<col-1;i++){
            C.add(B.get(i-1)+B.get(i));
        }
        C.add(1);
        return C;
    }
}
