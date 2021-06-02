package com.vladbadey.validator;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class StringValidatorTest {
    String input;

    @BeforeClass
    public void setUp() {
        input = "1 4 6 4 1 -3 5";
    }

    @Test
    public void isArrayTest() {
        boolean condition = StringValidator.isArray(input);
        assertTrue(condition);
    }

    @Test
    public void isArrayTestFalse() {
        boolean condition = StringValidator.isArray("-1z 3 6 3 -7");
        assertFalse(condition);
    }

    @Test
    public void isFileValidationTest() {
        boolean condition = StringValidator.isFileValidation("src/main/resources/file/array2.txt");
        assertTrue(condition);
    }

}
