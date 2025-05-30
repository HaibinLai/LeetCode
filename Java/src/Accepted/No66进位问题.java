package Accepted;

public class No66进位问题 {
    public int[] plusOne(int[] digits) {

        for(int i=0;i<digits.length;i++){
            digits[digits.length-i-1]=Add(digits[digits.length-i-1]);
            if(digits[digits.length-i-1]!=0) {break;}
        }
        if(digits[0]==0){
            int[] dig =new int[digits.length+1];
            dig[0]=1;
            return dig;
        }
        return digits;

    }
    public static int Add(int n){
        if(n<9){n+=1;}
        else if(n==9){n=0;}
        return n;
    }
}
