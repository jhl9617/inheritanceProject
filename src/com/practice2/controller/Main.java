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

        //상속 실습문제1의 문제3
        Point[] pArray = new Point[5];

        //point 레퍼런스 = Circle, Rectangle 객체의 주소;
        //상속관계에 있는 클래스일 때
        //부모 타입의 레퍼런스 = 후손객체의 주소; 대입 가능함
        //자동형변환됨 : UpCasting(후손타입이 부모타입으로 바뀜)
        //후손 안에 부모의 정보가 들어있기 때문에 가능함
        //다형성(Polymorphosm) 이 사용되었음
        pArray[0] = new Circle(100, 100, 50);
        pArray[1] = new Rectangle(100, 100, 50, 30);
        pArray[2] = new Circle(50, 123, 23);
        pArray[3] = new Circle(145, 45, 57);
        pArray[4] = new Rectangle(34, 12, 102, 12);

        for(Point p :pArray) {
            p.draw();
            //알아서 각 클래스의 draw()를 실행 시켜줌 (동적(dynamic == runtime) 바인딩 됨
            //컴파일시에는 Point 클래스에 draw() 를 연결함
            //실행할 때(동적) 참조하는 객체의 자료형에 따라 실행할 메소드 연결을 바꾸어서 실행함
        }
    }
}
