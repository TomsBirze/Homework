package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    final int numberSurveyed = 12467;
    final double energyDrinkerProc = 0.14;
    final double preferCitrusProc = 0.64;

    public static void main(String[] args) {
        EnergyDrinks monster = new EnergyDrinks();
        System.out.println("Total number of people surveyed " + monster.numberSurveyed);
        System.out.println("Approximately " + monster.calculateEnergyDrinkers(monster.numberSurveyed) + " bought at least one energy drink");
        System.out.println(monster.calculatePreferCitrus(monster.numberSurveyed) + " of those " + "prefer citrus flavored energy drinks.");
    }

    public double calculateEnergyDrinkers(double numberSurveyed) {
        double energyDrinkers = Math.floor(numberSurveyed * energyDrinkerProc);
        return energyDrinkers;
    }

    public double calculatePreferCitrus(int numberSurveyed) {
        double preferCitrus = Math.floor(numberSurveyed * energyDrinkerProc * preferCitrusProc);
        return preferCitrus;
    }
}
