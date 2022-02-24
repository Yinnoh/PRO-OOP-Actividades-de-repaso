package com.oopex.inheritanceEx;

import java.util.Arrays;

public class Frigate extends Boat{
    CrewMan[] crew;
    double radarExtension;
    int helicopterQuantity;

    public Frigate(String name , double tonnage,  CrewMan[] crew, double radarExtension, int helicopterQuantity ){
        super(name, tonnage);
        this.crew = crew;
        this.radarExtension = radarExtension;
        this.helicopterQuantity = helicopterQuantity;
    }

    public CrewMan[] getCrew() {
        return crew;
    }

    public void setCrew(CrewMan[] crew) {
        this.crew = crew;
    }

    public double getRadarExtension() {
        return radarExtension;
    }

    public void setRadarExtension(double radarExtension) {
        this.radarExtension = radarExtension;
    }

    public int getHelicopterQuantity() {
        return helicopterQuantity;
    }

    public void setHelicopterQuantity(int helicopterQuantity) {
        this.helicopterQuantity = helicopterQuantity;
    }

    @Override
    public String toString() {
        return "Frigate: {\n" +
                "name:" + this.getName() +
                "\ntonnage: "+ this.getTonnage() +
                "\ncrew: " + Arrays.toString(crew) +
                "\nradarExtension: " + radarExtension +
                "\nhelicopterQuantity: " + helicopterQuantity+ "\n}\n";
    }
}
