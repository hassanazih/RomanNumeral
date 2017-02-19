package fr.sg;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DecimalToRomanNumeralsConverterTest
{

    @Test
    public void should_return_I_when_input_is_1() throws Exception
    {
        Assertions.assertThat(DecimalToRomanNumeralConverter.convert(1)).isEqualTo("I");
    }

    @Test
    public void should_return_V_when_input_is_5() throws Exception
    {
        Assertions.assertThat(DecimalToRomanNumeralConverter.convert(5)).isEqualTo("V");
    }

    @Test
    public void should_return_X_when_input_is_10() throws Exception
    {
        Assertions.assertThat(DecimalToRomanNumeralConverter.convert(10)).isEqualTo("X");
    }

    @Test
    public void should_return_L_when_input_is_50() throws Exception
    {
        Assertions.assertThat(DecimalToRomanNumeralConverter.convert(50)).isEqualTo("L");
    }

    @Test
    public void should_return_C_when_input_is_100() throws Exception
    {
        Assertions.assertThat(DecimalToRomanNumeralConverter.convert(100)).isEqualTo("C");
    }
    @Test
    public void should_return_D_when_input_is_500() throws Exception
    {
        Assertions.assertThat(DecimalToRomanNumeralConverter.convert(500)).isEqualTo("D");
    }

    @Test
    public void should_return_M_when_input_is_1000() throws Exception
    {
        Assertions.assertThat(DecimalToRomanNumeralConverter.convert(1000)).isEqualTo("M");
    }
}
