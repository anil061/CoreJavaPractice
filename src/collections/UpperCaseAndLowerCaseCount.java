package collections;

/** String var="This is a Example of UpperCase and Lower Case and some @#$% Characters"
 *
 * */
public class UpperCaseAndLowerCaseCount {
    public static void main(String[] args) {
        String value = "This is a Example of UpperCase and Lower Case and some @#$% Characters";
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int specialCharacters = 0;
        for(int i=0; i< value.length(); i++){
            char charAt = value.charAt(i);
            if(Character.isUpperCase(charAt)){
                uppercaseCount++;
            } else if(Character.isLowerCase(charAt)){
                lowercaseCount++;
            } else if(!Character.isLetterOrDigit(charAt) && !Character.isWhitespace(charAt)){
                specialCharacters++;
            }
        }
        long upperCaseCharcount = value.chars().filter(Character::isUpperCase).count();
        long lowerCaseCharCount = value.chars().filter(Character::isLowerCase).count();
        long specialCharcount = value.chars().filter(charAt -> !Character.isLetterOrDigit(charAt) && !Character.isWhitespace(charAt)).
                count();
        System.out.println("upperCaseCharcount==> " + upperCaseCharcount);
        System.out.println("lowerCaseCharCount==> " + lowerCaseCharCount);
        System.out.println("specialCharcount==> " + specialCharcount);

        System.out.println("uppercaseCount==> " + uppercaseCount);
        System.out.println("lowercaseCount==> " + lowercaseCount);
        System.out.println("specialCharacters==> " + specialCharacters);
    }
}
