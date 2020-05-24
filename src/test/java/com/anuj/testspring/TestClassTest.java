package com.anuj.testspring;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestClassTest {

    @Test
    public void test1(){
        TestClass testClass = new TestClass();
        int sum = testClass.getSumOfNumbers(new int[] { 1, 2, 3, 4, 5 });
        assertEquals(15, sum);
    }
}
