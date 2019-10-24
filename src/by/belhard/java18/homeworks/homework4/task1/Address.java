package by.belhard.java18.homeworks.homework4.task1;
// Вроде бы закончил... Голова уже не варит
public class Address {
    String street;
    Integer houseNumber, buildingOfHouse;
    int room = 0, zipCode;

    public Address(String street, int houseNumber, Integer buildingOfHouse, int room, int zipCode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.buildingOfHouse = buildingOfHouse;
        this.room = room;
        this.zipCode = zipCode;
    }

    public Address(String street, int houseNumber, Integer buildingOfHouse) {
        this(street, houseNumber, buildingOfHouse, 0, 000000);
    }

    public Address(String street, int houseNumber) {
        this(street, houseNumber, null);
    }

    public Address() {
        street = "У этого здания нету адреса";
        houseNumber = null;
        buildingOfHouse = null;
    }

    public String toString() {
        String returnStr = street;
        if (houseNumber != null) {
            returnStr += " " + houseNumber;
            if (buildingOfHouse != null) returnStr += " корпус " + buildingOfHouse;
            if (room != 0) returnStr += " офис/квартира №" + room;
            if (zipCode != 0) {
                if(zipCode == 000000) returnStr += ", почтовый индекс не задан";
                else returnStr += ", почтовый индекс " + zipCode;
            }
        }
        return returnStr;
    }
}
