package com.practice2.controller;

import com.practice2.model.entity.Circle;
import com.practice2.model.entity.Point;
import com.practice2.model.entity.Rectangle;

public class Main {
    public static void main(String[] args) {
//        Circle circle1 = new Circle(4, 5, 10);
//        Circle circle2 = new Circle(1, 2, 5);
//        Circle circle3 = new Circle(5, 2, 8);
//        circle1.draw();
//        circle2.draw();
//        circle3.draw();
//
//        Rectangle rectangle1 = new Rectangle(1, 5 ,6 ,3);
//        Rectangle rectangle2 = new Rectangle(5, 4, 6, 8);
//        Rectangle rectangle3 = new Rectangle(2, 5, 3, 6);
//        rectangle1.draw();
//        rectangle2.draw();
//        rectangle3.draw();

        //��� �ǽ�����1�� ����3
        Point[] pArray = new Point[5];

        //point ���۷��� = Circle, Rectangle ��ü�� �ּ�;
        //��Ӱ��迡 �ִ� Ŭ������ ��
        //�θ� Ÿ���� ���۷��� = �ļհ�ü�� �ּ�; ���� ������
        //�ڵ�����ȯ�� : UpCasting(�ļ�Ÿ���� �θ�Ÿ������ �ٲ�)
        //�ļ� �ȿ� �θ��� ������ ����ֱ� ������ ������
        //������(Polymorphosm) �� ���Ǿ���
        pArray[0] = new Circle(100, 100, 50);
        pArray[1] = new Rectangle(100, 100, 50, 30);
        pArray[2] = new Circle(50, 123, 23);
        pArray[3] = new Circle(145, 45, 57);
        pArray[4] = new Rectangle(34, 12, 102, 12);

        for(Point p :pArray) {
            p.draw();
            //�˾Ƽ� �� Ŭ������ draw()�� ���� ������ (����(dynamic == runtime) ���ε� ��
            //�����Ͻÿ��� Point Ŭ������ draw() �� ������
            //������ ��(����) �����ϴ� ��ü�� �ڷ����� ���� ������ �޼ҵ� ������ �ٲپ ������
        }
    }
}
