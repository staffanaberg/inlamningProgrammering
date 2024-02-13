package common;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConverter {

    //Testa metoderna i Converter
    @Test
    public void testConversion() {
        Converter converter = new Converter();

        String testdata = "E";
        String actual = converter.getMorse(testdata);
        String expected = "*";

        assertEquals(expected, actual);


    }


}
