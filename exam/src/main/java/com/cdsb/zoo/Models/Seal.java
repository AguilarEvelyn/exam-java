package com.cdsb.zoo.Models;

import com.cdsb.zoo.Enums.AnimalType;
import com.cdsb.zoo.Enums.Diet;

public class Seal extends Animal {

    public Seal() {
        super("Foca", 80, Diet.CARNIVOROUS, 2, true, true, AnimalType.AQUATICS);
    }

    @Override
    public void makeSound() {
        System.out.println("La foca hace: 'Ar-ar!'");
    }

    



}
