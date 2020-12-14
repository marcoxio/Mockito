package com.example.mockito.helper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArraysCompareTest {
    @Test
    public void testArraySort_RandomArray() {
        int[] numbers = { 12, 3, 4, 1 };
        int[] expected = { 1, 3, 4, 12 };
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    //Junit4
    //@Test(expected=NullPointerException.class)

    //JUnit5
    @Test
    public void testArraySort_NullArray() {
        assertThrows(NullPointerException.class, () -> {
            int[] numbers = null;
            Arrays.sort(numbers);
        });
    }

    //JUnit4
    //@Test(timeout=100)

    //JUnit5
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void testSort_Performance(){
        int array[] = {12,23,4};
        for(int i=1;i<=1000000;i++)
        {
            array[0] = i;
            Arrays.sort(array);
        }
    }

}
