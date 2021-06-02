package com.vladbadey.service.impl;

import com.vladbadey.entity.CustomArray;
import com.vladbadey.exception.CustomArrayException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SortingImplTest {
    CustomArray array;
    SortingImpl sorting = new SortingImpl();

    @BeforeClass
    public void setArray() {
        array = new CustomArray(4, 2, 1, 3);
    }

    @Test
    public void bubbleSortTest() throws CustomArrayException {
        CustomArray expected = new CustomArray(1, 2, 3, 4);
        sorting.bubbleSort(array);
        assertEquals(array, expected);
    }

    @Test
    public void selectionSortTest() throws CustomArrayException {
        CustomArray expected = new CustomArray(1, 2, 3, 4);
        sorting.selectionSort(array);
        assertEquals(array, expected);
    }

    @Test
    public void insertionSortTest() throws CustomArrayException {
        CustomArray expected = new CustomArray(1, 2, 3, 4);
        sorting.insertionSort(array);
        assertEquals(array, expected);
    }
}
