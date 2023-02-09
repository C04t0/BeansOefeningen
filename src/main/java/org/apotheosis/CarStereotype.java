package org.apotheosis;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CarStereotype {

    private String name;

    private  String colour;

    @PostConstruct
    public void init() {
        name = "Mercedes";
        colour = "blue";
    }



    /**GETTERS & SETTERS**/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
