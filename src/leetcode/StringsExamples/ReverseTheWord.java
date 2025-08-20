package leetcode.StringsExamples;

public class ReverseTheWord {
    public static void main(String[] args) {
        String result =  extracted();
        System.out.println(result);
    }

    private static String extracted() {
        String s1 = "anil";
        char[] s = s1.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for(int i =s.length-1; i >=0; i--) {
            reverse.append(s[i]).append(" ");
        }
        return reverse.toString().trim();
    }
}
