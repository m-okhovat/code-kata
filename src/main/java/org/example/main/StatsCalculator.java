package org.example.main;

import java.util.List;

public class StatsCalculator {

    public int getMinimum(List<Integer> numbers) {
        int min = numbers.get(0);

        for (var number : numbers) {
            if (number < min)
                min = number;
        }
        ;

        return min;
    }

    public int getMaximum(List<Integer> numbers) {
        Integer maximum = Integer.MIN_VALUE;
        for (var number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }


    public int count(List<Integer> numbers) {
        int counter = 0;
        for (var number : numbers) {
            counter++;
        }

        return counter;
    }
}
