package com.mycompany.exercisetwo;

/**
 *
 * @author Cristian Gallego
 */
public class AnimalModel {
    
    private String kind;
    private String color;
    private String environment;
    private Boolean isDomesticable;
    private int legs;

    public String getColor() {
        return color;
    }

    public String getKind() {
        return kind;
    }

    public String getEnvironment() {
        return environment;
    }

    public Boolean getIsDomesticable() {
        return isDomesticable;
    }

    public int getLegs() {
        return legs;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setIsDomesticable(Boolean isDomesticable) {
        this.isDomesticable = isDomesticable;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
    
}