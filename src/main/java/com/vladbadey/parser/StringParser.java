package com.vladbadey.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class StringParser {
    static Logger logger = LogManager.getLogger();
    static String SPACE_REGEX = "\\s+";

    public static int[] parseStringIntoArray(String intString) {
        String[] lineElements = intString.split(SPACE_REGEX);
        int[] result = new int[lineElements.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(lineElements[i]);
        }
        logger.info("int string " + Arrays.toString(result) + " is parsed into array");
        return result;
    }
}
