package InterviewPractice;

public class SubstringOccurrenceCounter {
    public static void main(String[] args) {
        String t1 = "abababab";
        String t2 = "ab";
        int occurrences = countOccurrence(t1, t2);
        System.out.println("The substring \"" + t2 + "\" occurs " + occurrences + " times.");
    }

    private static int countOccurrence(String t1, String t2) {
        if(t2.isEmpty()){
            return 0;
        }
        int count = 0;
        int index = 0;
        while((index = t1.indexOf(t2, index)) != -1 ){
            count++;
            index = index + t2.length();
        }
        return count;
    }
}
