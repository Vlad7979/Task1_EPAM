package com.vladbadey.service;

import com.vladbadey.entity.CustomArray;
import com.vladbadey.exception.CustomArrayException;

public interface Functionality {
    int min(CustomArray array) throws CustomArrayException;
    int max(CustomArray array) throws CustomArrayException;
    CustomArray replaceAllNegativesToNum(int i, CustomArray array) throws CustomArrayException;
    double mean(CustomArray array) throws CustomArrayException;
    int sum(CustomArray array) throws CustomArrayException;
    int getCountOfPositiveElements(CustomArray array) throws CustomArrayException;
    int getCountOfNegativeElements(CustomArray array) throws CustomArrayException;
}
