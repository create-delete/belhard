package by.belhard.java18.homeworks.homework8.task5;

public class Fish extends Pet{
    public Fish(String name, PetType petType, boolean favoritePet) {
        super(name, petType, favoritePet);
    }

    @Override
    public void play() {
        if (getFavoritePet()){
            System.out.println("Sweeeeeming very fast");
            setEnergy(getEnergy()-1);
        }
        System.out.println("Sweeeeeming very fast");
        setEnergy(getEnergy()-1);
    }
}
