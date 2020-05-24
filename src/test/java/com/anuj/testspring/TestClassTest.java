package com.anuj.testspring;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class TestClassTest {

    @BeforeClass
    public static void beforeClassAnyMethod(){
        System.out.println("Before TestClassTest Class");
    }

    @AfterClass
    public static void afterClassAnyName(){
        System.out.println("After TestClassTest Class");
    }

    @Before
    public void beforeMethodAnyName(){
        System.out.println("Before Each Test Method in TestClassTest Class");
    }

    @After
    public void afterMethodAnyName(){
        System.out.println("After Each Test Method in TestClassTest Class");
    }

    @Test
    public void test1(){
        System.out.println("Running Test1");
        TestClass testClass = new TestClass();
        int sum = testClass.getSumOfNumbers(new int[] { 1, 2, 3, 4, 5 });
        assertEquals(15, sum);
    }

    @Test
    public void test2(){
        System.out.println("Running Test2");
        TestClass testClass = new TestClass();
        int sum = testClass.getSumOfNumbers(new int[] {  });
        assertEquals(0, sum);
    }
}
