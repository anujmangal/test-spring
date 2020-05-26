package com.anuj.testspring.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestServiceForMockitoTest {

    @InjectMocks
    TestServiceForMockito testServiceForMockito;

    @Mock
    TestServiceDAOForMockito testServiceDAOForMockito;

    @Test
    public void performSomething_test() {

        //Can chain multiple calls
        Mockito.when(testServiceDAOForMockito.getData())
                .thenReturn("From a mocked test method")
                .thenReturn("Second call to this method");

        assertEquals(testServiceForMockito.testMethod(), "From a mocked test method");
        assertEquals(testServiceForMockito.testMethod(), "Second call to this method");
    }
}
