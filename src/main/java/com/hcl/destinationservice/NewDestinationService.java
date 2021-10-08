package com.hcl.destinationservice;

import org.springframework.stereotype.Component;

@Component  //This step registers the bean for Spring to know it
public class NewDestinationService {

    public String getDestinationName(){
        return "Russia";
    }
}
