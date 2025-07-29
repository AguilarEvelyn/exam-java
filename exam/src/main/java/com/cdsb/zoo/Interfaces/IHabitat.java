package com.cdsb.zoo.Interfaces;
/**
 * Interface IHabitat
 * Define las características básicas que debe implementar cualquier hábitat en el zoológico.
 */

import java.util.List;

public interface IHabitat {
   void addAnimal(IAnimal animal); // Añade un animal al hábitat
   List<IAnimal> getAnimals(); // Obtiene la lista de animales en el hábitat
   String getHabitatType(); // Obtiene el tipo de hábitat (depredador/presa).
   int getSpaceAvailable(); // Obtiene el espacio disponible en m2

}
