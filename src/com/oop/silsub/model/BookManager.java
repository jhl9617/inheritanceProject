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
            System.out.print("***** ���� ���� �޴� *****\n" +
                    "\n" +
                    "\t1. ���� ���� �߰�\t//���ý� bookInput() �޼��� ������\n" +
                    "\t2. ��� ���\t//���ý� bookAllOutput() �޼��� ������\n" +
                    "\t7. ������\t\t//main() ���� return��");
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
            System.out.print(" å ���� :");
            bar[count].setTitle(scanner.next());
            System.out.print(" å ���� :");
            bar[count].setAuthor(scanner.next());
            System.out.print(" å ���� :");
            bar[count].setPrice(scanner.nextInt());
            System.out.print(" å ������ :");
            bar[count].setDiscountRate(scanner.nextDouble());
            System.out.print(" å ���ǻ� :");
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
