package TimeLimitExceed;

public class No70 {
    public int climbStairs(int n) {
        return Die(n);
    }
    public static int Die (int n){
        if(n==1){return 1;}
        if(n==2){return 2;}
        return Die(n-1)+Die(n-2);
    }
}

//if(n==1) return 1;
//
//        if(n==2) return 2;
//
//        int[] a =  new int[n];
//        a[0]=1;
//        a[1]=2;
//
//        for(int i=2;i<n;i++){
//            a[i]=a[i-1]+a[i-2];
//        }
//        return a[n-1];