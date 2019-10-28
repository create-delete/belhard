package by.belhard.java18.homeworks.homework5.task1;

public class Main {
    public static void main(String[] args) {
        Table table1 = new Table();
        Table table2 = new Table(); //int legs, int price, double height, Material material, Type type
        Table[] arrTable = {table1, table2, new Table(4, 100, 96.0, Material.GLASS, Type.ROUND)};
        for(Table t : arrTable){
            System.out.println(t);
        }
    }
}
