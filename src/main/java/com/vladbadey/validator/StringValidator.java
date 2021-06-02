package com.vladbadey.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {
    private static Logger logger = LogManager.getLogger();
    static String IS_VALID_STRING = "^-?\\d+(\\s+-?\\d+)+$";

    public static boolean isArray(String line) {
        Pattern pattern = Pattern.compile(IS_VALID_STRING);
        Matcher matcher = pattern.matcher(line.trim());
        System.out.println(line.trim());
        boolean isMatches = matcher.matches();
        logger.info("Method isArray for line " + line + " returns " + isMatches);
        return isMatches;
    }

    public static boolean isFileValidation(String path) {
        if (path == null) {
            return false;
        }
        File file = new File(path);
        return file.exists() && file.canRead() && file.isFile() && file.length() > 0;
    }
}
