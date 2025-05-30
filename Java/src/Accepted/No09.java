package Accepted;

public class No09 {
    public boolean isPalindrome(int x) {
        String s =x+"";
        String AntiS = "";
        for(int i=0;i<s.length();i++){
            AntiS=AntiS+s.charAt(s.length()-i-1);
        }
        boolean y =AntiS.equals(s);
        return y;


    }

//    public static void main(String[] args) {
//        No09 s =new No09();
//        s.isPalindrome(1234);
//    }
}
