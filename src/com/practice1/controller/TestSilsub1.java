package com.practice1.controller;

import com.practice1.model.vo.Book;

public class TestSilsub1 {
    public static void main(String[] args) {
        Book book1 = new Book("����1", "����1", 9800);
        Book book2 = new Book("����2", "����2", 8800);

        //print �ÿ� toString()�� �����ص� ��
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.equals(book2));

        Book book3 = (Book)book1.clone();
        System.out.println(book3 == book1);
        System.out.println(book3.equals(book1));

    }
}
