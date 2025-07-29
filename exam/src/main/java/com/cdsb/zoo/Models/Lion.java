package com.cdsb.zoo.Models;

import com.cdsb.zoo.Enums.AnimalType;
import com.cdsb.zoo.Enums.Diet;

public class Lion extends Animal {

   public Lion() {
       super("Leon", 50, Diet.CARNIVOROUS, 7, true, false, AnimalType.MAMMALS);
   }
}
