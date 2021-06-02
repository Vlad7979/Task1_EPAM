package com.vladbadey.service.impl;

import com.vladbadey.entity.CustomArray;
import com.vladbadey.exception.CustomArrayException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FunctionalityTest {
    FunctionalityImpl functionality;
    CustomArray array;

    @BeforeClass
    public void beforeClass() {
        functionality = new FunctionalityImpl();
        array = new CustomArray(1, 2, 3, -1, -2, -3);
    }

    // Find min tests

    @Test
    public void minTest() throws CustomArrayException {
        int actual = functionality.min(array);
        int expected = -3;
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void minTestFalse() throws CustomArrayException {
        functionality.min(null);
    }

    // Find max tests

    @Test
    public void maxTest() throws CustomArrayException {
        int actual = functionality.max(array);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void maxTestFalse() throws CustomArrayException {
        functionality.max(null);
    }

    // Replace all negatives to num test

    @Test
    public void replaceAllNegativesToNumTest() throws CustomArrayException {
        CustomArray actual = new CustomArray(-5, -2, 1, 5, -1, 5, 1);
        CustomArray expected = new CustomArray(0, 0, 1, 5, 0, 5, 1);
        assertEquals(functionality.replaceAllNegativesToNum(0, actual), expected);
    }

    // Mean test

    @Test
    public void meanTest() throws CustomArrayException {
        double actual = functionality.mean(array);
        double excpected = 0;
        assertEquals(actual, excpected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void meanTestFalse() throws CustomArrayException {
        functionality.mean(null);
    }

    // Sum test

    @Test
    public void sumTest() throws CustomArrayException {
        int actual = functionality.sum(array);
        int expected = 0;
        assertEquals(actual, expected);
    }

    // Get count of positive elements test

    @Test
    public void getCountOfPositiveElementsTest() throws CustomArrayException {
        int actual = functionality.getCountOfPositiveElements(array);
        int expected = 3;
        assertEquals(actual, expected);
    }

    // Get count of negative elements test

    @Test
    public void getCountOfNegativeElementsTest() throws CustomArrayException {
        int actual = functionality.getCountOfNegativeElements(array);
        int expected = 3;
        assertEquals(actual, expected);
    }
}
