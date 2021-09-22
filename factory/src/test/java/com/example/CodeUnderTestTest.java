package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CodeUnderTestTest {

    @Test
    void createFile() throws Exception {

        String fileName = "dummyFilename";
        File expected = new File("file.txt");

        try (MockedStatic<Factory> utilities = Mockito.mockStatic(Factory.class)) {

            utilities.when(() -> Factory.getInstance(File.class, fileName)).thenReturn(expected);

            File actual = new CodeUnderTest().createFile(fileName);

            assertThat(actual).isEqualTo(expected);
        }
    }
}
