package by.belhard.java18.homeworks.homework5.task3;

import java.util.Random;

/*
а) положить вещь на конкретную полку. Если полка занята – сообщение.
б) «закинуть» вещь в шкаф, она должна попадать на любую свободную полку, если таковая имеется. Если свободных полок нет – сообщение.
в) взять вещь с конкретной полки. Если полка пустая – сообщение об этом.
г) провести ревизию того, что есть в шкафу, то есть просто вывести на консоль содержимое всех полок.
Уделите внимание формату вывода.
 */
public class CaseForClothes {
    private Clothes[] shelf;

    public CaseForClothes(int count) {
        shelf = new Clothes[count];
    }

    public Clothes[] getShelf() {
        return shelf;
    }

    public void setShelf(int countShelf) {
        if (countShelf > 0) {
            Clothes[] caseClothes = new Clothes[countShelf];
            if (caseClothes.length >= shelf.length) caseClothes = shelf;
            else {
                for (int i = 0; i < caseClothes.length; i++) {
                    caseClothes[i] = shelf[i];
                }
            }
        }
    }

    //а) положить вещь на конкретную полку. Если полка занята – сообщение.
    public void putClothesOnTheShelf(Clothes clothes, int shelf) {
        if (this.shelf.length - 1 > shelf) System.out.println("The shelf you need doesn't exist.");
        else if (this.shelf[shelf] != null) System.out.println("The shelf is not empty.");
        else {
            this.shelf[shelf] = clothes;
        }
    }

    //б) «закинуть» вещь в шкаф, она должна попадать на любую свободную полку, если таковая имеется. Если свободных полок нет – сообщение.
    public void putClothesOnTheRandomShelf(Clothes clothes) {
        Random random = new Random();
        boolean isTrue = false;
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] == null) {
                isTrue = true;
                break;
            }
        }
        if (!isTrue) System.out.println("There are no free shelves.");
        while (isTrue) {
            int shelf = random.nextInt(this.shelf.length);
            if (this.shelf[shelf] != null) continue;
            else {
                this.shelf[shelf] = clothes;
                break;
            }
        }
    }

    //в) взять вещь с конкретной полки. Если полка пустая – сообщение об этом.
    public Clothes takeClothesOnShalf(int shelf) {
        Clothes result = null;
        if (this.shelf[shelf] == null || shelf < 0) {
            System.out.println("Error. Shelf is empty.");
        } else {
            result = this.shelf[shelf];
            this.shelf[shelf] = null;
        }
        return result;
    }

    //г) провести ревизию того, что есть в шкафу, то есть просто вывести на консоль содержимое всех полок.
    public void audit() {
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] == null) System.out.println((i + 1) + " shelf empty.");
            else System.out.println("In " + (i + 1) + " shelf lies " + shelf[i].toString());
        }
    }
}
