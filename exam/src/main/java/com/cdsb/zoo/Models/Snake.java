package com.cdsb.zoo.Models;

import com.cdsb.zoo.Enums.AnimalType;
import com.cdsb.zoo.Enums.Diet;

public class Snake extends Animal {

    public Snake() {
        super("Serpiente", 20, Diet.CARNIVOROUS, 3, true, false, AnimalType.REPTILES);
    }

    @Override
    public void makeSound() {
        System.out.println("La serpiente hace: 'Sssss!'");
    }

  

}
