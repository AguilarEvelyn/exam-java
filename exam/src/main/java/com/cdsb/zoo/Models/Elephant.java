package com.cdsb.zoo.Models;

import com.cdsb.zoo.Enums.AnimalType;
import com.cdsb.zoo.Enums.Diet;

public class Elephant extends Animal{

    public Elephant(){
        super("Elefante", 150, Diet.HERBIVOROUS, 5, false, true, AnimalType.MAMMALS);
    }

}
