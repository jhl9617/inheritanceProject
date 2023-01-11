package com.oop.silsub.model;

import com.oop.array3.model.Book;

import java.util.Scanner;

public class BookManager {
    Book book = new Book();
    private Book[] bar = null;
    Scanner scanner;

    private static int count = 0;

    {
        bar = new Book[10];
        scanner = new Scanner(System.in);
    }

    public BookManager() {
    }


    public void menu() {
        do {
            System.out.print("***** 도서 관리 메뉴 *****\n" +
                    "\n" +
                    "\t1. 도서 정보 추가\t//선택시 bookInput() 메서드 실행함\n" +
                    "\t2. 모두 출력\t//선택시 bookAllOutput() 메서드 실행함\n" +
                    "\t7. 끝내기\t\t//main() 으로 return함");
            int input = scanner.nextInt();

            switch (input){
                case 1:
                    bookInput();
                    break;
                case 2:
                    bookAllOutput();
                    break;
                case 7:
                    return;
                default:

            }
        }while (true);
    }


    public void bookInput() {
        if(count < 10){
            bar[count] = new Book();
            System.out.print(" 책 제목 :");
            bar[count].setTitle(scanner.next());
            System.out.print(" 책 저자 :");
            bar[count].setAuthor(scanner.next());
            System.out.print(" 책 가격 :");
            bar[count].setPrice(scanner.nextInt());
            System.out.print(" 책 할인율 :");
            bar[count].setDiscountRate(scanner.nextDouble());
            System.out.print(" 책 출판사 :");
            bar[count].setPublisher(scanner.next());
            count++;
        }
    }
    public void bookAllOutput() {
        for(int i = 0; i < count;i++){
            System.out.println(bar[i].info());
        }
    }

}
