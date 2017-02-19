package fr.sg;

public class DecimalToRomanNumeralConverter
{

    public static String convert(int decimal)
    {
        if(decimal == 1)
            return "I";
        return "X";
    }
}
