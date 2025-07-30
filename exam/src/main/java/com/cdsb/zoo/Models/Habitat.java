package com.cdsb.zoo.Models;

import java.util.ArrayList;
import java.util.List;

import com.cdsb.zoo.Enums.HabitatType;
import com.cdsb.zoo.Interfaces.IAnimal;
import com.cdsb.zoo.Interfaces.IHabitat;

public class Habitat implements IHabitat {
    private HabitatType type;
    private int ability; // 0-100 capacidad del hábitat
    private  List<IAnimal> animals;

    public Habitat(HabitatType type, int ability, List<IAnimal> animals) {
        this.type = type;
        this.ability = ability;
        this.animals = new ArrayList<>(animals);
    }

@Override
    public void addAnimal(IAnimal animal) {
       if(getSpaceAvailable() >= animal.getNecessarySpace()) {
            animals.add(animal);
        } else {
            System.out.println("No hay suficiente espacio para añadir el animal: " + animal.getSpeciesName());
        }
    }


    @Override
    public List<IAnimal> getAnimals() {
        return animals;

    }

    @Override
    public String getHabitatType() {
       return type.name();
    }

    @Override
    public int getSpaceAvailable() { // Calcula el espacio disponible restando el espacio usado del total de capacidad
        int usedSpace = 0;
        for (IAnimal animal : animals) {// Recorre la lista de animales y suma el espacio necesario de cada uno
            usedSpace += animal.getNecessarySpace();
        }
        return ability - usedSpace; // Resta el espacio usado del total de capacidad
    }


@Override
    public String toString() {
        return "Habitat [type=" + type + ", ability=" + ability + ", animals=" + animals + "]";
    }



}
