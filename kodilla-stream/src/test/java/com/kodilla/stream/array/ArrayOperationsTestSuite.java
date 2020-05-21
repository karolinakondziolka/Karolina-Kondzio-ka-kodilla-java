package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[10];
        numbers[0] = 7;
        numbers[1] = 3;
        numbers[2] = 2;
        numbers[3] = 5;
        numbers[4] = 1;
        numbers[5] = 4;
        numbers[6] = 3;
        numbers[7] = 5;
        numbers[8] = 1;
        numbers[9] = 8;

        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(3.9, average,0.1);
    }

}

