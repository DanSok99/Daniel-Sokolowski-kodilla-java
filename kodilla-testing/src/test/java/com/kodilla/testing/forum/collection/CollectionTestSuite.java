package com.kodilla.testing.forum.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @DisplayName("Check whether the class is valid when the list is empty")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator first= new OddNumbersExterminator();
        //When
        List<Integer> result = first.exterminate(emptyList);
        //Then
        Assertions.assertEquals(emptyList, result);
    }
    @DisplayName("Check whether the class behaves correctly when the list contains even and odd numbers")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(7);
        normalList.add(8);
        normalList.add(9);
        normalList.add(10);

        OddNumbersExterminator first= new OddNumbersExterminator();

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(8);
        expectedResult.add(10);
        //When
        List<Integer> result = first.exterminate(normalList);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
