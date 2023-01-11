package oop.inheritance.sample;

import java.util.Objects;

public class Rectangle extends Shape {

    //Field : 상속받은 부모 필드 2개 + 자기것 2개 => 할당됨
    private double width;
    private double height;

    //기본 생성자
    public Rectangle() {
        super();    //부모의 기본생성자 호출함
        System.out.println("Rectangle() 생성자 호출됨");
    }

    public Rectangle(double width, double height) {
        super();    //부모의 기본 생성자 호출함
        this.width = width;
        this.height = height;
        System.out.println("Rectangle 매개변수2개 있는 생성자 작동됨");
    }

    public Rectangle(double area, double perimeter, double width, double height) {
        super(area, perimeter);     //부모의 매개변수가 있는 생성자 호출함
        this.width = width;
        this.height = height;
        System.out.println("Rectangle 매개변수4개 있는 생성자 작동됨");
    }

    public Rectangle(String title, String author, int price) {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //일반 메소드
    //가로, 세로 값을 계산해서 면적과 둘레값을 기록하는 메소드
    public void calculator() {
        //this.area = this.width * this.height;
        //this.perimeter = (this.width + this.height) * 2;

        //상속받은 부모필드가 private 이므로
        this.setArea(this.width * this.height);
        this.setPerimeter((this.height + this.width) * 2);
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                "} " + super.toString();
    }

    //오버라이딩(overriding)
    //후손클래스 안에 부모 메소드를 다시 작성(implementing)하는 것
    //원칙 : 부모 메소드의 시그니처 똑같이 그대로 작성해야 함
    //메소드 안의 내용만 일부 수정함
    //단, 부모의 접근제한자보다 넓은 범위의 접근제한자 수정할 수 있음
    //예외처리 : 갯수를 줄일 수 있음
    //오버라이딩된 메소드 위에는 어노테이션(annotation)을 표시함
    //annotation : compiler 용 comment 임
    @Override
    public Object clone() {
        //원래 기능의 의미를 바꾸면 안 됨
        //this 가 참조하는 객체의 값들을 복사한 새 객체를 반환하는 메소드

        //깊은 복사(deep copy)라고 함
        return new Rectangle(this.width, this.height, this.getArea(), this.getPerimeter());
    }
    //Rectangle => Object 형 변환은 자동으로 변환됨
    //Object ==> Recatanle 형 변환은 수동으로 해 줘야 함

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        //if(o != null && o.getClass().getName().equals("Rectangle"))
        if (o != null && o instanceof Rectangle) {
            Rectangle other = (Rectangle) o;

            if (super.equals(o) && (this.width == other.width) && (this.height == other.height)){
                result = true;
            }
        }

            return result;
        }

        @Override
        public int hashCode () {
            return Objects.hash(super.hashCode(), width, height);
        }
    }
