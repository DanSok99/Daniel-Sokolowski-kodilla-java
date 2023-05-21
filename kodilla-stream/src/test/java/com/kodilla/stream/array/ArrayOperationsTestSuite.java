package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers[] = {3,2,5,1,3,3,3,3,5,5,5,6,6,1,1,1,2,3,4,1};
        double averageExpected = 3.15;
        //When
        double average = ArrayOperaions.getAverage(numbers);
        //Then
        assertEquals(averageExpected,average);
    }
}
