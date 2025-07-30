package com.cdsb.zoo.Models;

import com.cdsb.zoo.Enums.AnimalType;
import com.cdsb.zoo.Enums.Diet;

public class Iguana extends Animal {

    public Iguana() {
        super("Iguana", 15, Diet.HERBIVOROUS, 2, false, true, AnimalType.REPTILES);
    }

    @Override
    public void makeSound() {
        System.out.println("La iguana hace: 'Hisss!'");
    }

   

}
