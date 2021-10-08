package com.hcl.destinationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //This one is handling incoming requests from client and pass it out to others
public class NewDestinationController {

    @Value("${destination.temp:No destination temp found}")  //This is my injection of default temp value
    String destinationTemp;

    @Autowired  //Tells the program to pull the info from NewDestinationService
    NewDestinationService newDestinationService;

    @GetMapping("destination/name")
    public String getDestinationName(){
        return "Your destination is " + newDestinationService.getDestinationName() +
                ", the weather is " + destinationTemp +" degrees" ;
    }
}
