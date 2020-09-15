import java.util.ArrayList;

public class PersistentBugger {
    public static int persistence (int number){
        boolean isOneDigit = number < 10;
        if (isOneDigit) return 0;

        ArrayList<Integer> digits = getDigitsFromNumber(number);

        int multiplyResult = 1;
        for (int elem:digits) {
            multiplyResult *= elem;
        }
        return persistence(multiplyResult) + 1;
    }

    private static ArrayList<Integer> getDigitsFromNumber(int number) {
        ArrayList<Integer> digits = new ArrayList<Integer>();

        String numberParsed = String.valueOf(number);
        for(int i = 0; i < numberParsed.length(); i++){
            int digit = Character.getNumericValue(numberParsed.charAt(i));
            digits.add(digit);
        }
        return digits;
    }
}