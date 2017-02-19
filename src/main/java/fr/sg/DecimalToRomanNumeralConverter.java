package fr.sg;

import org.assertj.core.util.Preconditions;

public class DecimalToRomanNumeralConverter
{
    private static final String[] ROMAN_REPRESENTATIONS = {"I", "V", "X", "L", "C", "D", "M" };

    public static String convert(int decimal)
    {
        if (decimal < 1 || decimal > 3999) {
            throw new IllegalArgumentException("Input is out of bounds. It should be between 1 and 3999");
        }
        //cursor position on digital number (the digit that we're actually translating)
        int i = 0;
        String result= "";

        while (decimal > 0) {
            switch(decimal % 10) {
                case 1: result = ROMAN_REPRESENTATIONS[i] + result; break;
                case 2: result = ROMAN_REPRESENTATIONS[i] + ROMAN_REPRESENTATIONS[i] + result; break;
                case 3: result = ROMAN_REPRESENTATIONS[i] + ROMAN_REPRESENTATIONS[i] + ROMAN_REPRESENTATIONS[i] + result; break;
                case 4: result = ROMAN_REPRESENTATIONS[i] + ROMAN_REPRESENTATIONS[i + 1] + result; break;
                case 5: result = ROMAN_REPRESENTATIONS[i + 1] + result; break;
                case 6: result = ROMAN_REPRESENTATIONS[i + 1] + ROMAN_REPRESENTATIONS[i] + result; break;
                case 7: result = ROMAN_REPRESENTATIONS[i + 1] + ROMAN_REPRESENTATIONS[i] + ROMAN_REPRESENTATIONS[i] + result; break;
                case 8: result = ROMAN_REPRESENTATIONS[i + 1] + ROMAN_REPRESENTATIONS[i] + ROMAN_REPRESENTATIONS[i] + ROMAN_REPRESENTATIONS[i] +result; break;
                case 9: result = ROMAN_REPRESENTATIONS[i] + ROMAN_REPRESENTATIONS[i + 2] + result; break;
            }
            decimal = decimal / 10;
            i += 2;
        }
        return result;
    }
}
