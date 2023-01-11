package oop.inheritance.run;

import oop.inheritance.sample.Rectangle;

public class TestInheritance3 {
    public static void main(String[] args) {
        //오버라이딩 메소드 테스트용

        Rectangle r1 = new Rectangle(10, 10);
        r1.calculator();
        System.out.println(r1);

        //얕은 복사(shallow copy)
        //다른 객체의 주소를 복사 받는 것
        Rectangle r2 = r1;

        //깊은 복사(deep copy) 값까지 전부 copy
        Rectangle r3 = (Rectangle)r1.clone();
        //상속 관계에 있는 클래스끼리만 형변환 가능함
        //UpCasting : 후손 타입을 부모 타입으로 바꾸는 것(자동)
        //DownCasting : 부모 타입을 후손 타입으로 바꾸는 것(명시)(위에서는 (Rectangle)로 변환)
        System.out.println(r3);
        System.out.println(r1.hashCode());
        System.out.println(r1.hashCode());
        System.out.println(r3.hashCode());

        //equals() 확인
        System.out.println("확인 1 : " + (r1 == r2));    //true
        //주소가 같으냐?
        System.out.println("확인 2 : " + (r1 == r3));     //false

        //equals() overriding : 값이 같은지?
        System.out.println("확인 3 : " + (r1.equals(r3)));//true(r3는 r1의 클론이기 때문에 값이 같음)

    }
}
