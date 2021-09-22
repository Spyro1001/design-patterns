package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

class FactoryTest {

    @Test
    void testNoArgs() throws Exception {

        String expected = "";
        String actual = Factory.getInstance(String.class);
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void testArgs() throws Exception {

        Widget expected = new Widget(12);
        Widget actual = Factory.getInstance(Widget.class, 12);
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void testArgsWithFile() throws Exception {

        String fileName = "test.txt";
        File expected = new File(fileName);
        File actual = Factory.getInstance(File.class, fileName);
        assertThat(actual).isEqualTo(expected);

    }
}
