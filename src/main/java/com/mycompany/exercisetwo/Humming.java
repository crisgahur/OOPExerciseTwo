package com.mycompany.exercisetwo;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author usuario
 */
public class Humming extends Bird implements Death {

    @Override
    public void sleep() {
        System.out.println("The humming usually sleep few hours");
    }

    @Override
    public String die(LocalDate born, LocalDate die, String deathCause) {

        Period period = Period.between(born, die);

        return "The date of it's die is: " + die + ", lived: " + period.getYears() + " years, and the death     cause was: " + deathCause;

    }

    @Override
    public String reincarnate(String couldReincarnate) {
        return couldReincarnate;
    }

    public AnimalModel globalVariableAnimalModel;

    public Humming() {

        AnimalModel x = new AnimalModel();

        globalVariableAnimalModel = x;

    }

    public Humming(AnimalModel globalVariableAnimalModel) {

        globalVariableAnimalModel.color = "verde";
        globalVariableAnimalModel.isDomesticable = false;
        globalVariableAnimalModel.environment = "tropical";
        globalVariableAnimalModel.kind = "bird";

    }

}
