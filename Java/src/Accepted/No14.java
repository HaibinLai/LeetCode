package Accepted;

public class No14 {
    public String longestCommonPrefix(String[] strs) {
        String longest ="";
        String first =strs[0];
        char[] fir =first.toCharArray();

        for(int i=0;i<first.length()+1;i++){
            String prefix ="";
            for(int m=0;m<i;m++){
                prefix =prefix+ fir[m];
            }
            boolean IsLongest =true;
            for (String str : strs) {
                if (str.indexOf(prefix) != 0) {
                    IsLongest = false;
                    break;
                }
            }
            if(IsLongest){longest=prefix;}
        }
        return longest;
    }
}
