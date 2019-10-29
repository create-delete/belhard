package by.belhard.java18.lessons.lesson6.methodsObject;

public class ClazzExample {
    public static void main(String[] args) {
        ClazzExample clazzExample = new ClazzExample();

        Class clazz = clazzExample.getClass();

        System.out.println(clazz.isPrimitive());
        System.out.println(clazz);


    }
}
