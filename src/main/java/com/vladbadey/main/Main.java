package com.vladbadey.main;

import com.vladbadey.service.impl.SortingImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.vladbadey.entity.CustomArray;
import com.vladbadey.exception.CustomArrayException;
import com.vladbadey.parser.StringParser;
import com.vladbadey.reader.ArrayReader;
import java.io.File;

public class Main {
    private final static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        String path = new File("src/main/resources/file/array5.txt").getAbsolutePath();

        try {
            ArrayReader reader = new ArrayReader();
            String arrayLine = reader.readArrayLineFromFile(path);
            int[] array = StringParser.parseStringIntoArray(arrayLine);
            CustomArray entity = new CustomArray(array);
            logger.info("Main result is " + entity);
            SortingImpl sorting = new SortingImpl();
            sorting.bubbleSort(entity);
            logger.info("result = " + entity);
        } catch (CustomArrayException e) {
            logger.error("Exception in main");
        }
    }
}