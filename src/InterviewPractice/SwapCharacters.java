package InterviewPractice;

public class SwapCharacters {
    public static void main(String[] args) {
        String input = "abcdef";
        String swapped = swapEachCharacter(input);

        System.out.println("Original " + input);
        System.out.println("Swapped " + swapped);
    }

    private static String swapEachCharacter(String input) {
        char[] charArray = input.toCharArray();
        charArray.toString();
        for(int i= 0; i<charArray.length-1; i++){
            char c = charArray[i];
            charArray[i] = charArray[i+1];
            charArray[i+1] = c;
        }
        return new String(charArray);
    }
}
