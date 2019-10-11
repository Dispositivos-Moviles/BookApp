package com.nickgonzalezs.bookapp.model;

public class Book {

    private String isbn;
    private String name;
    private int img;

    public Book() {
    }

    public Book(String isbn, String name, int img) {
        this.isbn = isbn;
        this.name = name;
        this.img = img;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", img=" + img +
                '}';
    }
}
