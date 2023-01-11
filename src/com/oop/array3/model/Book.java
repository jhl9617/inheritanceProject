package com.oop.array3.model;

public class Book {

    //Field
    private String title;       //��������
    private String author;      //�����
    private int price;          //��������
    private double discountRate;//������
    private String publisher;   //���ǻ�

    public Book() {}

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author, int price, double discountRate, String publisher) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
        this.publisher = publisher;
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

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public String info() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", discountRate=" + discountRate +
                ", publisher='" + publisher + '\'' +
                '}';
    }




}
