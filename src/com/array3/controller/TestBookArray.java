package com.array3.controller;

import com.oop.silsub.model.BookManager;

import java.nio.Buffer;
import java.util.Scanner;

public class TestBookArray {
    Scanner scanner = new Scanner(System.in);

    public void test1() {

        System.out.print("���ڿ� �Է� :");
        String value1 = scanner.next();
        String value2 = scanner.next();
        String value3 = scanner.next();
        String value4 = scanner.next();
        String value5 = scanner.next();


        System.out.println("value1 : " + value1);
        System.out.println("value2 : " + value2);
        System.out.println("value3 : " + value3);
        System.out.println("value4 : " + value4);
        System.out.println("value5 : " + value5);
    }

    public void test2() {
        //nextLine() ���� ���ǻ��� :
        //���� ������ ���� ���޾Ƽ� �Է� ���� ��
        //nextLine() �տ� �ٸ� �Է��� ���� ��

        System.out.print("�̸� : ");
        String name = scanner.next();
        System.out.print("���� : ");
        int age = scanner.nextInt();
        System.out.print("�޼��� : ");

        //nextLine() : ���� �Է¸޼ҵ尡 ���� ����Ű(unicode: 13)�� ���ڿ� ������ ���� : �Է��� �ǳʶ�
        // => �ذ� :�Է¹���(stdin)�� ���� ����Ű�� ������
        scanner.nextLine();
        String message = scanner.nextLine();

        System.out.println(name + ", " + age + ", " + message);


    }
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        //bookManager.menu();
        TestBookArray testBookArray = new TestBookArray();
        testBookArray.test2();
    }
}
