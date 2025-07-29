package com.cdsb.zoo.Models;

import com.cdsb.zoo.Enums.AnimalType;
import com.cdsb.zoo.Enums.Diet;

public class Zebra extends Animal {

    public Zebra() {
        super("Cebra", 60, Diet.HERBIVOROUS, 2, false, true, AnimalType.MAMMALS);
    }

}
