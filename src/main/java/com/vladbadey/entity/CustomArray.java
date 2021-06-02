package com.vladbadey.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.vladbadey.exception.CustomArrayException;
import java.util.Arrays;

public class CustomArray {
    private static Logger logger = LogManager.getLogger();
    private int[] array;

    public CustomArray(int... array) {
        this.array = array;
    }

    public int[] getArray() throws CustomArrayException {
        if (array.length < 1) {
            logger.error("Wrong size");
            throw new CustomArrayException("Wrong size");
        }
        return Arrays.copyOf(array, array.length);
    }

    public int get(int i) throws CustomArrayException {
        if (i < 0 || i >= array.length) {
            logger.error("Element is incorrect");
            throw new CustomArrayException("Element is incorrect");
        }
        return array[i];
    }

    public void set(int position, int value) throws CustomArrayException {
        if (position < 0 || position >= array.length) {
            logger.error("Element is incorrect");
            throw new CustomArrayException("Element is incorrect");
        }
        array[position] = value;
    }

    public int size() {
        return array.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray that = (CustomArray) o;

        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
