package Java8;

public class ReplaceWith {
    public static void main(String[] args) {
        String cardType = "DebitCard";
        String cardNumber = "1234567891234567";
        System.out.println(replaceWithHashAndDolla(cardType,cardNumber));
    }
    private static String replaceWithHashAndDolla(String cardType, String cardNumber) {
         if("DebitCard".equals(cardType) && cardNumber.length() >= 16) {
             int len = cardNumber.length();
             return cardNumber.substring(0, len - 4) + "****";
         }
         return "Something Went Wrong";
    }
}
