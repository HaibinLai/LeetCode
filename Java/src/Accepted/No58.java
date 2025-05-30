package Accepted;

public class No58 {
    public int lengthOfLastWord(String s) {
        String[] cut =s.split(" ");
        return cut[cut.length-1].length();

    }
}
