package com.cdsb.zoo.Models;

import java.util.ArrayList;
import java.util.List;

import com.cdsb.zoo.Interfaces.IAnimal;
import com.cdsb.zoo.Interfaces.IHabitat;
import com.cdsb.zoo.Interfaces.IZooManager;

public class ZooManager implements IZooManager {
    private List<Habitat> habitats;

    public ZooManager(){
        this.habitats = new ArrayList<>();
    }

    @Override
    public void RegisterInhabitants(IHabitat habitat) { // Registra un hábitat en el zoológico
        habitats.add((Habitat) habitat);
    }


    public boolean AddAnimalToHabitat(IAnimal animal, IHabitat habitat) {// Añade un animal a un hábitat específico
        if(habitats.contains(habitat)){
            ((Habitat) habitat).addAnimal(animal);
            return true;

        }
        return false;
    }


    public void ShowZooStatus() { // Muestra el estado del zoológico, incluyendo los hábitats y los animales en ellos
        System.out.println("\n Estado actual  del Zoológico:\n");
        for(Habitat h : habitats){
            System.out.println("--" + h);
            for(IAnimal a : h.getAnimals()){
                System.out.println("--" + a.getSpeciesName());
            }
        }
    }

    @Override
    public void feedAllTheAnimals() { // Alimenta a todos los animales del zoológico
        System.out.println("\n Alimentando a todos los animales del zoológico:");
        for(Habitat h : habitats){ // Itera sobre cada hábitat
            for(IAnimal a : h.getAnimals()){
                a.feed(); // Llama al método alimentar de cada animal
                System.out.println("--" + a.getSpeciesName() + " ha sido alimentado.");

            }
        }
    }

    public void showCard(){ // Muestra la tarjeta de información de todos los animales en el zoológico
        System.out.println("\n Mostrando tarjetas de información de todos los animales:");
        for(Habitat h : habitats){ // Itera sobre cada hábitat
            for(IAnimal a : h.getAnimals()){ // Itera sobre los animales en cada hábitat
                System.out.println(a.showCard());
            }
        }
    }

    public void makeSound() {
        System.out.println("\n Haciendo que todos los animales hagan su sonido característico:");
        for(Habitat h : habitats){ // Itera sobre cada hábitat
            for(IAnimal a : h.getAnimals()){ // Itera sobre los animales en cada hábitat
                a.makeSound(); // Llama al método hacer sonido de cada animal
            }
        }
    }



}
