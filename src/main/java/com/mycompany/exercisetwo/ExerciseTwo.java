package com.mycompany.exercisetwo;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author usuario
 */
public class ExerciseTwo {

    public static void main(String[] args) {

        Humming colibri = new Humming();
        System.out.println(colibri.die(LocalDate.of(2015, Month.SEPTEMBER, 6), LocalDate.of(2022, Month.AUGUST, 13), "Asi quiso el destino"));
        System.out.println(colibri.reincarnate("yes"));
        colibri.sleep();
        System.out.println(colibri.timeAtFly(1));
        
        System.out.println("");

        Cow vaca = new Cow();
        System.out.println(vaca.die(LocalDate.of(2009, 7, 17), LocalDate.of(2023, 1, 20), "Intoxication"));
        System.out.println(vaca.reincarnate("no"));
        vaca.eat();
        vaca.drinkMilk();

    }
}