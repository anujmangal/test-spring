package com.anuj.testspring.mockito;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class TestServiceDAOForMockito {

    public String getData(){
        return "I call to get data from database";
    }
}
