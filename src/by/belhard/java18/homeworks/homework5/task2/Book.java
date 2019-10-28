package by.belhard.java18.homeworks.homework5.task2;

public class Book {
    private String title;
    private int pages;
    private Author[] authors;

    public Book(String title, int pages, Author[] authors) {
        this.title = title;
        if (pages < 2) this.pages = 0;
        else this.pages = pages;
        if (authors.length > 0) this.authors = authors;
    }

    public Book(String title, int pages) {
        this.title = title;
        if (pages < 2) this.pages = 0;
        else this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public Author[] getAuthors() {
        if (authors.length > 0) return authors;
        else return null;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        // before star (доп 1)
        //return title + " " + pages + " pages. Author: " + (authors != null ? authors.toString() : " The author is not specified.");

        if (pages == 0) return "Error. Book is not exist.";
        String result = title + " " + pages + " pages. Authors: ";
        if (authors.length > 0)
            for (Author a : authors) {
                result += a.toString();
            }
        else result += "not specified.";
        return result;
    }
}
