package com.mycompany.exercisetwo;

import java.time.LocalDate;

/**
 *
 * @author Cristian Gallego
 */
public interface Death {

    public String die(LocalDate born, LocalDate die, String deathCause);

    public String reincarnate(String couldReincarnate);

}