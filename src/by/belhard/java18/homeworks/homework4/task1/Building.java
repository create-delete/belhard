package by.belhard.java18.homeworks.homework4.task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
Здание можно охарактеризовать
-назначением (например, жилой дом, офисное здание, промышленный объект, хоз. постройка и т.д.).
-адресом
-количеством этажей
-наличием(или отсутствием) лифта
-материалом, из которого оно построено
-годом постройки
-Адрес состоит из улицы и номера дома.
 */
public class Building{
    BuildingUse buildingUse;
    Address address;
    int floorCount;
    boolean isLift;
    Material material;
    Date dateOfConstruction;
    List<Person> peoples = new ArrayList<>();

    public Building(BuildingUse buildingUse, Address address, int floorCount, boolean isLift, Material material){
        dateOfConstruction = new Date();
        this.buildingUse = buildingUse;
        this.address = address;
        this.floorCount = floorCount;
        this.isLift = isLift;
        this.material = material;
    }
    // Подразумеваю, что здание еще не построено, либо построено где то в лесу и пустует
    public Building(){
        this(BuildingUse.WITHOUT_ASSIGNING, new Address(), 0, false, Material.DONT_KNOW);
    }

    public void destroyBuilding(){
        /*
        Тут написан код, который уничтожает этот класс
        но я не знаю как это написать
        this.fatalMathaFucka();
         */
    }
    /*
    Уже и так много времени положил на первое задание.
    А через 4 часа надо быть на курсах
    Поэтому не расписываю class Person и по какому принципу заполняются дома
     */
    public void settlingTheBuilding(String[] args){
        if(this.buildingUse == BuildingUse.APARTMENT) {
            peoples.add(new Person());
        } else if(this.buildingUse == BuildingUse.PUBLIC_BUILDING) {
            peoples.add(new Person());
        } else if(this.buildingUse == BuildingUse.INDUSTRIAL) {
            peoples.add(new Person());
        } else if(this.buildingUse == BuildingUse.AGRICULTURE) {
            peoples.add(new Person());
        } else if(this.buildingUse == BuildingUse.WITHOUT_ASSIGNING) {
            peoples.add(new Person());
        }
    }
}
