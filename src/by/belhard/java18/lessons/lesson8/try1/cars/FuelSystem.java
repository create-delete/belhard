package by.belhard.java18.lessons.lesson8.try1.cars;

import by.belhard.java18.lessons.lesson8.try1.exceptions.InvalidFuelParameterException;

public class FuelSystem {

    private final FuelType fuelType;

    private final int maxValue;

    private int currentValue;

    public FuelSystem(FuelType fuelType, int maxValue, int currentValue) {
        this.fuelType = fuelType;
        this.maxValue = maxValue;
        this.currentValue = currentValue;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int fillFuel(int newValue) {

        if (newValue <= 0)
            throw new InvalidFuelParameterException("Negative or zero parameter");

        if (maxValue > currentValue + newValue) {
            newValue -= (maxValue - currentValue);
            currentValue = maxValue;
            return newValue;
        } else return 0;
    }

    public void burnFuel(int value) {
        if (value <= 0)
            throw new InvalidFuelParameterException("Negative or zero parameter");

        currentValue -= value;

        if (currentValue <= 0)
            currentValue = 0;
    }

}
