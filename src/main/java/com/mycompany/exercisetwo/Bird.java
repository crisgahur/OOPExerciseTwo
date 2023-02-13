package com.mycompany.exercisetwo;

/**
 *
 * @author Cristian Gallego
 */
public class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println("The birds usually eat the whole day");
    }

    public String timeAtFly(int hours) {
        return "The bird can fly during " + hours + " hour(s)";
    }

}