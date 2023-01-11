package oop.inheritance.sample;


import java.util.Objects;

//자바 언어로 만들어지는 모든 클래스들은 자동으로
//java.lang.Object 클래스의 후손(sub class)으로 만들어짐
//부모 클래스(super class)
public class Shape {
    private double area;         //도형의 면적
    private double perimeter;    //도형의 둘레
//    protected double area;         //도형의 면적
//    protected double perimeter;    //도형의 둘레

    {
        area = 10.;
        perimeter = 14.;
    }

    public Shape() {
        super();    //첫줄에만 기록해야 함
        //부모의 기본생성자 없으면 후손클래스가 에러 발생함
        System.out.println("기본 생성자 실행됨");
    }

    public Shape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
        System.out.println("Shape 생성자 실행됨");
    }


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        //원래 기능 : this 와 obj가 가진 주소가 같은지?
        //return this == o;

        //오버라이딩 하는 이유 : 두 개게의 각 필드값이 같으지?
        Shape shape = (Shape) obj;
        if ((this.area == shape.area) && (this.perimeter == shape.perimeter)) {
            return true;
        }else{
            return false;
        }

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Object clone() {
        //원래 기능의 의미를 바꾸면 안 됨
        //this 가 참조하는 객체의 값들을 복사한 새 객체를 반환하는 메소드

        //깊은 복사(deep copy)라고 함
        return new Shape(this.area, this.perimeter);
    }


}
