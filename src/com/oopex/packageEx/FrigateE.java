package com.oopex.packageEx;

import java.util.Arrays;

public class FrigateE extends BoatE {
    CrewManE[] crew;
    double radarExtension;
    int helicopterQuantity;

    public FrigateE(String name , double tonnage, CrewManE[] crew, double radarExtension, int helicopterQuantity ){
        super(name, tonnage);
        this.crew = crew;
        this.radarExtension = radarExtension;
        this.helicopterQuantity = helicopterQuantity;
    }

    public CrewManE[] getCrew() {
        return crew;
    }

    public void setCrew(CrewManE[] crew) {
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
