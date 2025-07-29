package com.cdsb.zoo.Models;

import com.cdsb.zoo.Enums.AnimalType;
import com.cdsb.zoo.Enums.Diet;

public class Dolphin  extends Animal {

    public Dolphin() {
        super("Delfin", 50, Diet.CARNIVOROUS, 3, true, true, AnimalType.AQUATICS);
    }



}
