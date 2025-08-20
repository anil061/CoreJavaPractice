package Demo;

public class StringLastWordLength {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";

       s = s.trim();
             int result =  lengthofLastword(s);
        System.out.println("lenght of last word " + result);
    }

    private static int lengthofLastword(String s) {
        int lastSpace = s.lastIndexOf(' ');
        int lengthOfLastword = s.length() - lastSpace - 1;
        return lengthOfLastword;
    }
}
