package fr.sg;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class DecimalToRomanNumeralsConverterTest {

    private int input;
    private String result;

    public DecimalToRomanNumeralsConverterTest(int input, String result) {
        this.input = input;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection addedNumbers() {
        return Arrays.asList(new Object[][]{{1, "I"}, {5, "V"},
                {10, "X"}, {50, "L"}, {100, "C"}, {500, "D"}, {1000, "M"}, {2, "II"}, {3, "III"}, {4, "IV"}, {9, "IX"}, {40, "XL"}, {90, "XC"}, {240, "CCXL"},{3999,"MMMCMXCIX"}});
    }

    @Test
    public void should_return_translated_value_assigned_to_input() throws Exception {
        Assertions.assertThat(DecimalToRomanNumeralConverter.convert(input)).isEqualTo(result);
    }

}
