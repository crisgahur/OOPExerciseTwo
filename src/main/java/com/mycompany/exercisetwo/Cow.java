package com.mycompany.exercisetwo;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Cristian Gallego
 */
public class Cow extends Mammalian implements Death {

    @Override
    public String die(LocalDate born, LocalDate die, String deathCause) {
        Period period = Period.between(born, die);

        String result = ((period.getYears() * 2) % 2 == 0) ? "pair number" : "odd number";

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

    public Cow() {
        AnimalModel localVariableAnimalModel = new AnimalModel();
        localVariableAnimalModel.color = "White and black";
        localVariableAnimalModel.environment = "Countryside";
        localVariableAnimalModel.kind = "Mammalian";
        localVariableAnimalModel.isDomesticable = true;
        localVariableAnimalModel.legs = 4;
    }

}