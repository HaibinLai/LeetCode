package CompiledError;

public class No08 {
    public int myAtoi(String s) {
        String[]S =s.split(" ");
        int s1 = Integer.parseInt(S[0]);
        if(s1>=0){return s1;}
        return 0;
    }
}
