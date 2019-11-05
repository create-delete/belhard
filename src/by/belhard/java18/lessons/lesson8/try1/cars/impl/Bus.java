package by.belhard.java18.lessons.lesson8.try1.cars.impl;

import by.belhard.java18.lessons.lesson8.try1.cars.Car;
import by.belhard.java18.lessons.lesson8.try1.cars.FuelSystem;
import by.belhard.java18.lessons.lesson8.try1.cars.FuelType;
import by.belhard.java18.lessons.lesson8.try1.cars.WheelType;
import by.belhard.java18.lessons.lesson8.try1.exceptions.InvalidFuelParameterException;

import java.util.Arrays;
import java.util.List;

public class Bus extends Car {

    private static final List<FuelType> possibleFuelTypes =
            Arrays.asList(FuelType.AI92, FuelType.AI98);

    public Bus(String title, WheelType wheels, boolean wheelsOkState, FuelSystem fuelSystem) {
        super(title, WheelType.MEDIUM, wheelsOkState, checkFuel(fuelSystem));
    }

    private static FuelSystem checkFuel(FuelSystem fuelSystem) {

        if (possibleFuelTypes.contains(fuelSystem.getFuelType()))
            return fuelSystem;
        throw new InvalidFuelParameterException("Invalid fuel type");
    }
}
