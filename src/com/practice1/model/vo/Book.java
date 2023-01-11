package com.practice1.model.vo;

import oop.inheritance.sample.Rectangle;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if(obj != null && obj instanceof Book) {
            Book other = (Book) obj;
            if((Objects.equals(this.author, other.author)) &&
                    (Objects.equals(this.title, other.title)) &&
                    (Objects.equals(this.price, other.price))){
                result = true;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public Object clone() {
        return new Book(this.title, this.author, this.price);
    }
}
