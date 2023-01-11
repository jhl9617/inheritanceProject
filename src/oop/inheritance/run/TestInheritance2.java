package oop.inheritance.run;

import oop.inheritance.sample.Rectangle;

public class TestInheritance2 {
    public static void main(String[] args) {
        //상속구조에서 생성자 호출 관계
        //부모클래스의 필드와 메소드만 상속받게 됨
        //생성자, 초기블럭은 상속 안 됨

        Rectangle rectangle = new Rectangle();
        //부모생성자 먼저 실행되고 나서, 후손생성자 작동 확인함

        System.out.println(rectangle.toString());
        Rectangle rectangle1 = new Rectangle(10,20);
        Rectangle rectangle2 = new Rectangle(20,20,400,100);

        //메소드 사용  본인 것 사용 + 부모의 public 메소드 사용
        //부모의 public 이 아닌 protected 나 default, private 은 후손 클래스 안에서 사용 할 수 있음
        System.out.println(rectangle1);
        rectangle1.calculator();
        System.out.println(rectangle1);

        //부모 메소드 사용 : 자신의 것처럼 사용하면 됨
        rectangle.setWidth(2);
        rectangle.setHeight(3);
        rectangle.calculator();
        System.out.println(rectangle);


    }
}
