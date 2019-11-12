package by.belhard.java18.homeworks.homework8.task5;


public class Human {
    Pet pet;
    int joy = 100;

    public Human(Pet pet) {
        this.pet = pet;
        joy = 50;
    }

    public void playWithPet(){
        pet.play();
        joy++;
    }
}
