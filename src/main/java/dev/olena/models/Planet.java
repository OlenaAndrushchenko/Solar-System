package dev.olena.models;

import dev.olena.enums.PlanetType;

public class Planet {
    private String name;
    private int satellites;
    private double mass;
    private double volume;
    private int diameter;
    private int distanceToSun;
    private PlanetType type;
    private boolean visibleWithNakedEye;
    private double orbitalPeriod;
    private double rotationPeriod;

    public Planet(String name, int satellites, double mass, double volume, int diameter, int distanceToSun, PlanetType type, boolean visibleWithNakedEye, double orbitalPeriod, double rotationPeriod) {
        this.name = name;
        this.satellites = satellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
        this.type = type;
        this.visibleWithNakedEye = visibleWithNakedEye;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
    }

    public double calculateDensity() {
        return mass / volume;
    }

    public boolean isOuterPlanet() {
        double distanceInKm = distanceToSun * 149597870.0;
        return distanceInKm > 3.4 * 149597870;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Satellites: " + satellites);
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Volume: " + volume + " km³");
        System.out.println("Diameter: " + diameter + " km");
        System.out.println("Distance to Sun: " + distanceToSun + " million km");
        System.out.println("Type: " + type);
        System.out.println("Visible with Naked Eye: " + visibleWithNakedEye);
        System.out.println("Orbital Period: " + orbitalPeriod + " years");
        System.out.println("Rotation Period: " + rotationPeriod + " days");
        System.out.println("Density: " + calculateDensity() + " kg/km³");
        System.out.println("Is Outer Planet: " + isOuterPlanet());
    }
}
