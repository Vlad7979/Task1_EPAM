package com.vladbadey.parser;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class StringParserTest {
    String intData = "1 -4 6";
    @Test
    public void parseStringIntoArrayTest() {
        int[] actual = StringParser.parseStringIntoArray(intData);
        int[] expected = {1, -4, 6};
        assertEquals(actual, expected);
    }
}
