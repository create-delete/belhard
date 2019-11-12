package by.belhard.java18.homeworks.homework8.task5;

public class Cat extends Pet{
    public Cat(String name, PetType petType, boolean favoritePet) {
        super(name, petType, favoritePet);
    }

    @Override
    public void play() {
        if (getFavoritePet()){
            System.out.println("Meeeeew");
            setEnergy(getEnergy()-1);
        }
        System.out.println("Meeeeew");
        setEnergy(getEnergy()-1);
    }
}
