package by.belhard.java18.lessons.lesson8.try1.cars;

import by.belhard.java18.lessons.lesson8.try1.exceptions.InvalidFuelParameterException;

import java.util.List;

public abstract class Car {

    private String title;

    private WheelType wheels;
    private boolean wheelsOkState;

    private FuelSystem fuelSystem;

    public Car(String title, WheelType wheels, boolean wheelsOkState, FuelSystem fuelSystem) {
        this.title = title;
        this.wheels = wheels;
        this.wheelsOkState = wheelsOkState;
        this.fuelSystem = fuelSystem;
    }

    public String getTitle() {
        return title;
    }

    public WheelType getWheels() {
        return wheels;
    }

    public boolean isWheelsOkState() {
        return wheelsOkState;
    }

    public int fillFuel (int newValue){
        return fuelSystem.fillFuel(newValue);
    }

    public void destroyWheels(){
        wheelsOkState = false;
    }

    public void burnFuel(int value) {
        try {
            this.fuelSystem.burnFuel(value);
        } catch (InvalidFuelParameterException e) {
            System.out.println(e.getMessage());
        }
    }

    public FuelSystem checkFuel(FuelSystem fuelSystem, List<FuelType> fuelTypeList) {
        if (fuelTypeList.contains(fuelSystem.getFuelType()))
            return fuelSystem;
        throw new InvalidFuelParameterException("Invalid fuel type");
    }
 /*
 ЗАБРАТЬ У ВСЕХ КЛАССОВ РЕАЛИЗАЦИЙ МАШИН МЕТОД checkFuel
  */
}
