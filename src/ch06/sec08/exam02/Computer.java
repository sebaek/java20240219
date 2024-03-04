package ch06.sec08.exam02;

import java.util.Arrays;

public class Computer {

    int sum(int... values) {

        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        return sum;
    }
}
