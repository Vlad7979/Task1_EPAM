package com.vladbadey.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.vladbadey.entity.CustomArray;
import com.vladbadey.exception.CustomArrayException;
import com.vladbadey.service.Sorting;

public class SortingImpl implements Sorting {
    private static Logger logger = LogManager.getLogger();

    @Override
    public void bubbleSort(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.error("Array is null");
            throw new CustomArrayException("Array is null");
        }
        int i = 0;
        int n = array.size();
        boolean swapNeeded = true;
        while (i < n - 1 && swapNeeded) {
            swapNeeded = false;
            for (int j = 1; j < n - i; j++) {
                if (array.get(j - 1) > array.get(j)) {
                    int temp = array.get(j - 1);
                    array.set(j - 1, array.get(j));
                    array.set(j, temp);
                    swapNeeded = true;
                }
            }
            if(!swapNeeded) {
                break;
            }
            i++;
        }
    }

    @Override
    public void selectionSort(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.error("Array is null");
            throw new CustomArrayException("Array is null");
        }
        for (int i = 0; i < array.size() - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(minElementIndex) > array.get(j)) {
                    minElementIndex = j;
                }
            }

            if (minElementIndex != i) {
                int temp = array.get(i);
                array.set(i, array.get(minElementIndex));
                array.set(minElementIndex, temp);
            }
        }
    }

    @Override
    public void insertionSort(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.error("Array is null");
            throw new CustomArrayException("Array is null");
        }
        for (int i = 1; i < array.size(); i++) {
            int key = array.get(i);
            int j = i - 1;
            while (j >= 0 && array.get(j) > key) {
                array.set(j + 1, array.get(j));
                j = j - 1;
            }
            array.set(j + 1, key);
        }
    }
}
