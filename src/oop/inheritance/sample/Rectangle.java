package oop.inheritance.sample;

import java.util.Objects;

public class Rectangle extends Shape {

    //Field : ��ӹ��� �θ� �ʵ� 2�� + �ڱ�� 2�� => �Ҵ��
    private double width;
    private double height;

    //�⺻ ������
    public Rectangle() {
        super();    //�θ��� �⺻������ ȣ����
        System.out.println("Rectangle() ������ ȣ���");
    }

    public Rectangle(double width, double height) {
        super();    //�θ��� �⺻ ������ ȣ����
        this.width = width;
        this.height = height;
        System.out.println("Rectangle �Ű�����2�� �ִ� ������ �۵���");
    }

    public Rectangle(double area, double perimeter, double width, double height) {
        super(area, perimeter);     //�θ��� �Ű������� �ִ� ������ ȣ����
        this.width = width;
        this.height = height;
        System.out.println("Rectangle �Ű�����4�� �ִ� ������ �۵���");
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

    //�Ϲ� �޼ҵ�
    //����, ���� ���� ����ؼ� ������ �ѷ����� ����ϴ� �޼ҵ�
    public void calculator() {
        //this.area = this.width * this.height;
        //this.perimeter = (this.width + this.height) * 2;

        //��ӹ��� �θ��ʵ尡 private �̹Ƿ�
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

    //�������̵�(overriding)
    //�ļ�Ŭ���� �ȿ� �θ� �޼ҵ带 �ٽ� �ۼ�(implementing)�ϴ� ��
    //��Ģ : �θ� �޼ҵ��� �ñ״�ó �Ȱ��� �״�� �ۼ��ؾ� ��
    //�޼ҵ� ���� ���븸 �Ϻ� ������
    //��, �θ��� ���������ں��� ���� ������ ���������� ������ �� ����
    //����ó�� : ������ ���� �� ����
    //�������̵��� �޼ҵ� ������ ������̼�(annotation)�� ǥ����
    //annotation : compiler �� comment ��
    @Override
    public Object clone() {
        //���� ����� �ǹ̸� �ٲٸ� �� ��
        //this �� �����ϴ� ��ü�� ������ ������ �� ��ü�� ��ȯ�ϴ� �޼ҵ�

        //���� ����(deep copy)��� ��
        return new Rectangle(this.width, this.height, this.getArea(), this.getPerimeter());
    }
    //Rectangle => Object �� ��ȯ�� �ڵ����� ��ȯ��
    //Object ==> Recatanle �� ��ȯ�� �������� �� ��� ��

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
