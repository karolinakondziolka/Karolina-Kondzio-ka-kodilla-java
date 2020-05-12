package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumberExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Odd numbers exterminator: start!");
    }
    @After
    public void after(){
        System.out.println("Test Odd numbers exterminator: end!");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        //When
        ArrayList<Integer> result = oddNumberExterminator.exterminate(new ArrayList<>());
        //Then
        Assert.assertEquals(0, result.size());
        System.out.println("Result with empty list: " + result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(34);
        numbers.add(56);
        numbers.add(90);
        numbers.add(27);
        numbers.add(91);
        numbers.add(22);
        numbers.add(1);
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        evenNumbers.add(34);
        evenNumbers.add(56);
        evenNumbers.add(90);
        evenNumbers.add(22);
        //When
        ArrayList<Integer> result = oddNumberExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(evenNumbers, result);
        System.out.println("Result with normal list: " + result);

    }
}
