package by.belhard.java18.lessons.lesson5.try1;

public class Person {
    public void eat(){
        System.out.println("I'm eating.");
    }
    public void eat(String dish){
        System.out.println("I'm eating" + dish + "! Om-nom");
    }
    public void eat(String dish, int number){
        System.out.println("I'm eating" + number + " of " + dish + "! Om-nom");
    }
    public void eat(int time, String type){
        System.out.println("I will have " + type + " at " + time);
    }
}
