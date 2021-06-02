package com.vladbadey.reader;

import com.vladbadey.exception.CustomArrayException;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArrayReaderTest {

    @Test
    public void readArrayLineFromFileTest() throws CustomArrayException {
        String actual = new ArrayReader().readArrayLineFromFile("src/main/resources/file/array2.txt");
        String expected = "23 3 12 -4 -123";
        assertEquals(actual, expected);
    }
}
