package com.cdsb.zoo.Models;

import com.cdsb.zoo.Enums.HabitatType;

public class Main {
    public static void main(String[] args) {

        System.out.println("Gestión de Zoológico");

        ZooManager zooManager = new ZooManager();

        Habitat savannah = new Habitat(HabitatType.TERRESTRIAL, 400);
        Habitat aquatic = new Habitat(HabitatType.WATER, 300);
        Habitat aviary = new Habitat(HabitatType.TERRARIUM, 100);

        // Registro de hábitats en el zoológico
        zooManager.RegisterInhabitants(savannah);
        zooManager.RegisterInhabitants(aquatic);
        zooManager.RegisterInhabitants(aviary);

        // Añadiendo animales a los hábitats
        zooManager.AddAnimalToHabitat(new Lion(), savannah);
        zooManager.AddAnimalToHabitat(new Dolphin(), aquatic);
        zooManager.AddAnimalToHabitat(new Snake(), aviary);

         // Mostrando el estado del zoológico
        zooManager.showCard();// Muestra la tarjeta de información de todos los animales
        zooManager.feedAllTheAnimals(); // Alimenta a todos los animales del zoológico
        zooManager.makeSound(); // Hace que todos los animales hagan su sonido característico
        zooManager.ShowZooStatus(); // Muestra el estado del zoológico

        System.out.println("Fin de la gestión del zoológico.");

        System.out.println("---");

        System.out.println("Gracias Profesor por la oportunidad de aprender y aplicar conceptos de programación orientada a objetos en este proyecto de zoológico.");




    }
}
