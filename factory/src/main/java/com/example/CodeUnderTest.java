package com.example;

import java.io.File;

public class CodeUnderTest {

    public File createFile(String fileName) throws Exception {

        return Factory.getInstance(File.class, fileName);

    }
}
