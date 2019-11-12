package by.belhard.java18.homeworks.homework8.task5;

public abstract class Pet implements Playing {
    private String name;
    private PetType petType;
    private int energy;
    private boolean favoritePet;

    public Pet(String name, PetType petType, boolean favoritePet) {
        this.name = name;
        this.petType = petType;
        this.energy = 100;
        this.favoritePet = favoritePet;
    }

    public void setEnergy(int energy) {
        if (energy <= 0) {
            System.out.println("Yeah...! Your pet died.");
            return;
        }
        this.energy = energy;

    }

    public boolean getFavoritePet(){
        return favoritePet;
    }

    public int getEnergy() {
        return energy;
    }

    public String getName() {
        return name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void rest(int time) {
        if (time > 0) {
            while (time > 0) {
                if (energy < 100) {
                    setEnergy(getEnergy() + 1);
                    time--;
                }
            }
        }
    }
}
