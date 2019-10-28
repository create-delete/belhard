package by.belhard.java18.homeworks.homework5.task2;

//доп2. Опишите класс Картотека.
// Он будет содержать метод, который должен принимать 3 параметра: массив книг, имя и фамилию.
// Возвращать этот метод должен массив книг этого автора (либо пустой массив, если книг этого автора нет).
public class FileCabinet {

    public Book[] getBookByAuthor(Book[] inputBooks, String name, String surname) {
        int count = 0;
        Book[] tempBooks;

        for (Book book : inputBooks) {
            Author[] authors = book.getAuthors();
            if (authors != null) {
                for (Author author : authors) {
                    if (author.getName() == name && author.getSurname() == surname) {
                        count++;
                    }
                }
            }
        }

        tempBooks = new Book[count];
        if (tempBooks.length == 0) return tempBooks;////////////////////////////////////////ВОЗВРАЩАЕМ ПУСТОЙ МАССИВ

        count = 0;
        for (Book book : inputBooks) { //////////////////////////С ARRAYLIST или каким нибудь другим List-ом этот цикл бы не понадобился
            Author[] authors = book.getAuthors();
            if (authors != null) {
                for (Author author : authors) {
                    ///////Если имя и фамилия совпадают - книгу присваиваем порядковой ячейке. Номер для слудеющей ячейки повышаем на 1
                    if (author.getName() == name && author.getSurname() == surname) {
                        tempBooks[count] = book;
                        count++;
                    }
                }
            }
        }
        return tempBooks;
    }
}
