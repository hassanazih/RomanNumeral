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
}
