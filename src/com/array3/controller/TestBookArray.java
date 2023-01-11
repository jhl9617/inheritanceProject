package com.array3.controller;

import com.oop.silsub.model.BookManager;

import java.nio.Buffer;
import java.util.Scanner;

public class TestBookArray {
    Scanner scanner = new Scanner(System.in);

    public void test1() {

        System.out.print("문자열 입력 :");
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
        //nextLine() 사용시 주의사항 :
        //여러 종류의 값을 연달아서 입력 받을 시
        //nextLine() 앞에 다른 입력이 있을 때

        System.out.print("이름 : ");
        String name = scanner.next();
        System.out.print("나이 : ");
        int age = scanner.nextInt();
        System.out.print("메세지 : ");

        //nextLine() : 이전 입력메소드가 남긴 엔터키(unicode: 13)를 문자열 값으로 읽음 : 입력이 건너뜀
        // => 해결 :입력버퍼(stdin)에 남은 엔터키를 제거함
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
