package com.cdsb.zoo.Models;

import com.cdsb.zoo.Enums.AnimalType;
import com.cdsb.zoo.Enums.Diet;

public class Parrot extends Animal{
    public Parrot() {
        super("Loro", 10, Diet.OMNIVOROUS, 3, false, true, AnimalType.BIRDS);
    }

    @Override
    public void makeSound() {
        System.out.println("El loro dice: '¡Hola, Hola!'");
    }

    


}
