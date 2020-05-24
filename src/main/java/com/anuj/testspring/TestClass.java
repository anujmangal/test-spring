package com.anuj.testspring;

import java.util.Arrays;

public class TestClass {

    public int getSumOfNumbers(int[] numbers){
        return Arrays.stream(numbers).reduce(0, Integer::sum);
    }

}
