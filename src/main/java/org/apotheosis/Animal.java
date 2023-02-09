package org.apotheosis;


import org.springframework.stereotype.Component;

@Component
public class Animal {

    private String name;
    private String colour;




    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
