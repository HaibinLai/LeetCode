import java.util.Scanner;

public class N001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[]Ans = new int[n];
        for(int i =0;i<n;i++){
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 =s1+s2;
            Ans[i] = s3;
        }
        for(int a : Ans){
            System.out.println(a);
        }

    }
}
