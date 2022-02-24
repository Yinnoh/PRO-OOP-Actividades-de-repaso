package com.oopex.packageEx;

public class BoatE {
    private String name;
    private double tonnage;
    private double boatBeam;
    private double boatLength;

    public BoatE(String name, double tonnage) {
        this.name = name;
        this.tonnage = tonnage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public double getBoatBeam() {
        return boatBeam;
    }

    public void setBoatBeam(double boatBeam) {
        this.boatBeam = boatBeam;
    }

    public double getBoatLength() {
        return boatLength;
    }

    public void setBoatLength(double boatLength) {
        this.boatLength = boatLength;
    }

    @Override
    public String toString() {
        return "Boat: {" +
                "name: '" + name + '\'' +
                ", tonnage: " + tonnage +
                ", boatBeam: " + boatBeam +
                ", boatLength: " + boatLength +
                '}';
    }
}
