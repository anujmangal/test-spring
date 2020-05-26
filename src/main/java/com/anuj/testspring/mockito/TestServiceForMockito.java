package com.anuj.testspring.mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceForMockito {

    @Autowired
    private TestServiceDAOForMockito testServiceDAOForMockito;

    public String testMethod(){
        return testServiceDAOForMockito.getData();
    }
}
