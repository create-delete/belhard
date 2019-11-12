package by.belhard.java18.homeworks.homework8.task5;

public class Dog extends Pet{
    public Dog(String name, PetType petType, boolean favoritePet) {
        super(name, petType, favoritePet);
    }

    @Override
    public void play() {
        if (getFavoritePet()){
            System.out.println("WOW");
            jump();
            setEnergy(getEnergy()-1);
        }
        System.out.println("WOW");
        jump();
        setEnergy(getEnergy()-1);
    }

    public void jump(){
        setEnergy(getEnergy()-1);
    }
}
