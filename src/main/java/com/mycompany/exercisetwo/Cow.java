package com.mycompany.exercisetwo;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Cristian Gallego
 */
public class Cow extends Mammalian implements Death {

    public String result;

    @Override
    public String die(LocalDate born, LocalDate die, String deathCause) {
        
        Period period = Period.between(born, die);

        if (period.getYears() % 2 == 0) {

            result = "pair number";
        } else {
            result = "odd number";
        }
        return "The date of death was: " + die + ", the number is " + result + ", lived: " + period.getYears() + " years, and the death cause was: " + deathCause;

    }

    @Override
    public String reincarnate(String couldReincarnate) {
        return couldReincarnate + ", you can do it!";
    }

    @Override
    public void drinkMilk() {
        System.out.println("The cow offer milk to the humans");
    }

    public AnimalModel globalVariableAnimalModel;

    public Cow() {
        AnimalModel x = new AnimalModel();

        globalVariableAnimalModel = x;
    }

}
