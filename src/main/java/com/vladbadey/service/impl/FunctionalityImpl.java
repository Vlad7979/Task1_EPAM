package com.vladbadey.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.vladbadey.entity.CustomArray;
import com.vladbadey.exception.CustomArrayException;
import com.vladbadey.service.Functionality;
import java.util.stream.IntStream;

public class FunctionalityImpl implements Functionality {
    private static Logger logger = LogManager.getLogger();

    @Override
    public int min(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.error("Array is null");
            throw new CustomArrayException("Array is null");
        }
        return IntStream.of(array.getArray())
                .min()
                .getAsInt();
    }

    @Override
    public int max(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.error("Array is null");
            throw new CustomArrayException("Array is null");
        }
        return IntStream.of(array.getArray())
                .max()
                .getAsInt();
    }

    @Override
    public CustomArray replaceAllNegativesToNum(int i, CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.error("Array is null");
            throw new CustomArrayException("Array is null");
        }
        return new CustomArray(IntStream.of(array.getArray())
                .map(s -> s < 0 ? i : s)
                .toArray());
    }

    @Override
    public double mean(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.error("Array is null");
            throw new CustomArrayException("Array is null");
        }
        return (int) IntStream.of(array.getArray())
                .average()
                .getAsDouble();
    }

    @Override
    public int sum(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.error("Array is null");
            throw new CustomArrayException("Array is null");
        }
        return IntStream.of(array.getArray())
                .sum();
    }

    @Override
    public int getCountOfPositiveElements(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.error("Array is null");
            throw new CustomArrayException("Array is null");
        }
        return (int) IntStream.of(array.getArray())
                .filter(i -> i > 0)
                .count();
    }

    @Override
    public int getCountOfNegativeElements(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.error("Array is null");
            throw new CustomArrayException("Array is null");
        }
        return (int) IntStream.of(array.getArray())
                .filter(i -> i < 0)
                .count();
    }
}
