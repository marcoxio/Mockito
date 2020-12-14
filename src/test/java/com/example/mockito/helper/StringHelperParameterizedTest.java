package com.example.mockito.helper;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

public class StringHelperParameterizedTest {

    // AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA
    StringHelper helper = new StringHelper();
    private String input;
    private String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @ParameterizedTest
    public static Collection<String[]> testConditions() {
        String expectedOutputs[][] = {
                { "AACD", "CD" },
                { "ACD", "CD" } };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(expectedOutput,
                helper.truncateAInFirst2Positions(input));
    }
}
