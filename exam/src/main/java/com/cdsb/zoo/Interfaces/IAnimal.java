package com.cdsb.zoo.Interfaces;

/**
 * Interface IAnimal
 * Define las características básicas que debe implementar cualquier animal en el zoológico.
 */

public interface IAnimal {
     String getSpeciesName();//nombre de la especie
    int getNecessarySpace();//espacio necesario en m2
    String getDiet();//tipo de dieta
    int getFeedingFrequency();//frecuencia de alimentación
    boolean requiresSpecialCare(); //requiere cuidados especiales
    boolean canLiveInGroup(); // puede vivir en grupo

}
