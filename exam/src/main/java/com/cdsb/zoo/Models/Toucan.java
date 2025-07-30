package com.cdsb.zoo.Models;

import com.cdsb.zoo.Enums.AnimalType;
import com.cdsb.zoo.Enums.Diet;

public class Toucan extends Animal {

    public Toucan() {
        super("Tucán", 6, Diet.OMNIVOROUS, 4, false, true, AnimalType.BIRDS);
    }

    @Override
    public void makeSound() {
        System.out.println("El tucán hace: 'Caa-caa!'");
    }

   
}
