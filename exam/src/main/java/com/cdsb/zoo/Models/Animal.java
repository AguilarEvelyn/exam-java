package com.cdsb.zoo.Models;

import com.cdsb.zoo.Enums.AnimalType;
import com.cdsb.zoo.Enums.Diet;
import com.cdsb.zoo.Interfaces.IAnimal;

public class Animal  implements IAnimal{
    protected String getSpeciesName; //nombre de la especie
    protected int necessarySpace;//espacio necesario en m2
    protected  Diet diet; //tipo de dieta
    protected int feedingFrequency;// frecuencia de alimentación
    protected boolean specialCare;// cuidados especiales
    protected boolean canLiveInGroup;// puede vivir en grupo
    protected AnimalType Type;// tipo de animal


    public Animal(String getSpeciesName, int necessarySpace, Diet diet, int feedingFrequency, boolean specialCare, boolean canLiveInGroup, AnimalType type) {
        this.getSpeciesName = getSpeciesName;
        this.necessarySpace = necessarySpace;
        this.diet = diet;
        this.feedingFrequency = feedingFrequency;
        this.specialCare = specialCare;
        this.canLiveInGroup = canLiveInGroup;
        Type = type;
    }


    @Override
    public String getSpeciesName() {
        return getSpeciesName;
    }


    @Override
    public int getNecessarySpace() {
        return necessarySpace;
    }


    @Override
    public String getDiet() {
        return diet.toString();
    }

    @Override
    public int getFeedingFrequency() {
        return feedingFrequency;
    }

    @Override
    public boolean requiresSpecialCare() {
        return specialCare;
    }


    @Override
    public boolean canLiveInGroup() {
        return canLiveInGroup;

    }


    @Override
    public String toString() {
        return "Animal [getSpeciesName=" + getSpeciesName + ", necessarySpace=" + necessarySpace + ", diet=" + diet
                + ", feedingFrequency=" + feedingFrequency + ", specialCare=" + specialCare + ", canLiveInGroup="
                + canLiveInGroup + ", Type=" + Type + "]" + "\n";
    }






}
