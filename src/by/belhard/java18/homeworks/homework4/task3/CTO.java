package by.belhard.java18.homeworks.homework4.task3;

public class CTO {
    private String name;
    private boolean paunch;
    private int workExp;
    private double paunchSize, quality;
    private boolean dzen = false;

    public CTO(String name, boolean paunch, int workExp) {
        this.name = name;
        this.workExp = workExp;
        int veriableForPaunchSize = 3;
        if ((veriableForPaunchSize - workExp) >= 0) {
            paunchSize = 0;
        }else {
            paunch = true;
            paunchSize = workExp*5;
            if(paunchSize >= 100) dzen = true;
        }
        quality = workExp/2;
    }

    public CTO(String name) {
        this(name, false, 0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getWorkExp(){
        return workExp;
    }

    public void eat(){
        if(paunch) paunchSize+=0.1;
        if(paunchSize >= 100) dzen = true;
    }
     public void drinkBear(){
        if(paunch) {
            paunchSize ++;
            if(paunchSize >= 100) dzen = true;
        }
        else {
            paunch = true;
            paunchSize = 0.5;
            if(paunchSize >= 100) dzen = true;
        }
        quality+=0.1;
     }

     public void scheduledTask(SystemAdmin slave){
        Task.GetTask(slave);
     }
      public void isDzen (){
        if(dzen) System.out.println("Пошли все в задницу, ничего не буду делать");
        else System.out.println("Я еще ничего не понимаю, ничего не буду делать");
      }
}
