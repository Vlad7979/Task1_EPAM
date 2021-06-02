package com.vladbadey.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.vladbadey.exception.CustomArrayException;
import com.vladbadey.validator.StringValidator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArrayReader {
    static Logger logger = LogManager.getLogger();
    public String readArrayLineFromFile(String path) throws CustomArrayException {
        String result = null;
        if (!StringValidator.isFileValidation(path)) {
            logger.error("File validation failed");
            throw new CustomArrayException("File validation failed");
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine();
            while (line != null) {
                if (StringValidator.isArray(line)) {
                    result = line;
                    logger.info("String " + result + " is read");
                    return result;
                } else {
                    logger.error("Line " + line + " is invalid");
                    result = null;
                    line = bufferedReader.readLine();
                }
            }
        } catch (IOException e) {
            logger.error("File not found");
            throw new CustomArrayException("File not found");
        }
        return result;
    }
}
