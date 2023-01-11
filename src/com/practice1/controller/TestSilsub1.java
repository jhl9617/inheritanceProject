package com.practice1.controller;

import com.practice1.model.vo.Book;

public class TestSilsub1 {
    public static void main(String[] args) {
        Book book1 = new Book("제목1", "저자1", 9800);
        Book book2 = new Book("제목2", "저자2", 8800);

        //print 시에 toString()을 생략해도 됨
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.equals(book2));

        Book book3 = (Book)book1.clone();
        System.out.println(book3 == book1);
        System.out.println(book3.equals(book1));

    }
}
