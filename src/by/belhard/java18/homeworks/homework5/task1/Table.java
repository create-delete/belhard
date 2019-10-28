package by.belhard.java18.homeworks.homework5.task1;
/*
Описать класс Table. Поля: количество ножек, высота, материал, тип (круглый, прямоугольный, другой формы), цена.
Переопределить для него метод toString(), чтобы данные о каждом объекте выводились «красиво».
В другом классе создать несколько экземпляров класса Table, записать их в массив, вывести на консоль все элементы массива.
 */
public class Table {
    private int legs, price;
    private double height;
    private Material material;
    private Type type;

    public Table(int legs, int price, double height, Material material, Type type) {
        this.legs = legs;
        this.price = price;
        this.height = height;
        this.material = material;
        this.type = type;
    }
    public Table() {
        type = Type.JUST_TABLE;
        material = Material.NOT_DEFINED;
    }


    public String toString () {
        String result = "Table made of " + material.name().toLowerCase() + " type: " + type.name().toLowerCase() +
                " share. Height: " + height + ". Legs count: " + legs;
        if(price <= 0) result += ". Not for sale";
        else result += ". It cost " + price + " dollars";
        return result;
    }
}
