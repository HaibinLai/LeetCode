package Accepted;

public class No29 {
    public int divide(int dividend, int divisor) {
        int yu =dividend%divisor;
        long num =dividend-yu;
        long k =num/divisor;
        if(k<=-2147483648){return -2147483648;}
        if(k>=2147483647){return 2147483647;}
        int ans = Math.toIntExact(k);
        return ans;

    }
}
