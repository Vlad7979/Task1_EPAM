package com.vladbadey.service;

import com.vladbadey.entity.CustomArray;
import com.vladbadey.exception.CustomArrayException;

public interface Sorting {
    void bubbleSort(CustomArray array) throws CustomArrayException;
    void selectionSort(CustomArray array) throws CustomArrayException;
    void insertionSort(CustomArray array) throws CustomArrayException;
}
