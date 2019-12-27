package com.puneet.datastructure.arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {

    BinarySearch bs;

    @Before
    public void setUp() {
        bs = new BinarySearch();
    }

    @Test
    public void testWhenTargetPresentInMiddle() {
        //Set Up
        List<Integer> input = Arrays.asList(2, 4, 6, 8, 10);

        // SUT
        int posInd = bs.find(input,6);
        int posIndRecursive = bs.findRecursive(input, 6);

        //Assertion
        assertThat("Should Return 2",
                posInd,
                is(2));

        assertThat("Recursive Should Return 2",
                posIndRecursive,
                is(2));
    }

    @Test
    public void testWhenTargetPresentInStarting() {
        //Set Up
        List<Integer> input = Arrays.asList(2, 4, 6, 8, 10);

        // SUT
        int posInd = bs.find(input,2);
        int posIndRecursive = bs.findRecursive(input, 2);

        //Assertion
        assertThat("Should Return 0",
                posInd,
                is(0));

        assertThat("Recursive Should Return 0",
                posIndRecursive,
                is(0));
    }

    @Test
    public void testWhenTargetPresentAtLast() {
        //Set Up
        List<Integer> input = Arrays.asList(2, 4, 6, 8, 10);

        // SUT
        int posInd = bs.find(input,10);
        int posIndRecursive = bs.findRecursive(input, 10);

        //Assertion
        assertThat("Should Return 4",
                posInd,
                is(4));

        assertThat("Recursive Should Return 4",
                posIndRecursive,
                is(4));
    }

    @Test
    public void testWhenTargetRepeatedPresentInStarting() {

        //Set Up
        List<Integer> input = Arrays.asList(2, 2, 2, 4, 6, 8, 10);

        // SUT
        int posInd = bs.find(input,2);
        int posIndRecursive = bs.findRecursive(input, 2);

        //Assertion
        assertThat("Should Return 0",
                posInd,
                is(0));

        assertThat("Recursive Should Return 0",
                posIndRecursive,
                is(0));
    }

    @Test
    public void testWhenTargetRepeatedPresentInEnd() {
        //Set Up
        List<Integer> input = Arrays.asList(2, 4, 6, 8, 10, 10, 10, 10);

        // SUT
        int posInd = bs.find(input,10);
        int posIndRecursive = bs.findRecursive(input, 10);

        //Assertion
        assertThat("Should return 4",
                posInd,
                is(4));

        assertThat("Recursive Should return 4",
                posIndRecursive,
                is(4));
    }

    @Test
    public void testWhenTargetNotPresent() {
        //Set Up
        List<Integer> input = Arrays.asList(2, 4, 6, 8, 10, 10, 10, 10);

        // SUT
        int posInd = bs.find(input,12);
        int posIndRecursive = bs.findRecursive(input, 12);

        //Assertion
        assertThat("Should return -1",
                posInd,
                is(-1));

        assertThat("Recursive Should return -1",
                posIndRecursive,
                is(-1));
    }
}
