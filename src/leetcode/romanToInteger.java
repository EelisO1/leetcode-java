package leetcode;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {


    /**
     * Converts a given roman numeral to integer.
     *
     * @param s String to be converted
     * @return The converted integer
     */
    public static int romanToInt(String s) {
        int result = 0;
        char[] str = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = str.length-1; i >= 0; i--) {
            

        }

        for (char string : str) {
            System.out.println(string);
            if (map.containsKey(string)) {
                result += map.get(string);
            }
        }

        return result;
    }


    public static void main(String[] args) {
        String roman = "MCMXCIV"; //1994, M = 1000, CM = 900, XC = 90 and IV = 4
        //              M CM XC IV
        // Every tenth has a max of 3 roman numerals
        int result = romanToInt(roman);
        System.out.println(result);
    }
}
