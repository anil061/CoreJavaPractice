/*2 = ABC
* 3= DEF
* 4= GHI
* 5 = JKL
* 6 = MNO
* 7 = PQRS
* 8 = TUV
* 9= WXYZ*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InternalCode {
          public static Map<Character, String> digitToLetter = new HashMap<>();

          static {
              digitToLetter.put('2', "ABC");
              digitToLetter.put('3', "DEF");
          }
    public static void main(String[] args) {

        //Combination-digits
        combination("2");
    }

    private static void combination(String num) {
       List<String> strs = new ArrayList<>();
        if(num == null || num.isEmpty()){

        }
        covertToLetter(num, 0, strs);
    }

    private static void covertToLetter(String num, int index, List<String> str) {
        index = num.length();
        char digit = num.charAt(index);
        String  letter = digitToLetter.get(digit);
        for(int i = 0; i < letter.length(); i ++){
            char c = letter.charAt(i);

        }
    }

}
