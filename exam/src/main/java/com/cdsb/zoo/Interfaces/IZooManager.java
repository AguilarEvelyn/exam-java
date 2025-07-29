package com.cdsb.zoo.Interfaces;

public interface IZooManager {
    void RegisterInhabitants(Habitat habitat); // Registra un hábitat en el zoológico
    boolean AddAnimalToHabitat(IAnimal animal, IHabitat habitat); // Añade un animal a un hábitat
    void ShowZooStatus(); // Muestra el estado del zoológico
}

