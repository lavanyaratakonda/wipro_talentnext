package com.wipro.task;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSortValues() {
        DailyTasks dt = new DailyTasks();

        int[] input = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};

        int[] result = dt.sortValues(input);

        assertArrayEquals(expected, result);
    }
}