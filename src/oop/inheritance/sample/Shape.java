package oop.inheritance.sample;


import java.util.Objects;

//�ڹ� ���� ��������� ��� Ŭ�������� �ڵ�����
//java.lang.Object Ŭ������ �ļ�(sub class)���� �������
//�θ� Ŭ����(super class)
public class Shape {
    private double area;         //������ ����
    private double perimeter;    //������ �ѷ�
//    protected double area;         //������ ����
//    protected double perimeter;    //������ �ѷ�

    {
        area = 10.;
        perimeter = 14.;
    }

    public Shape() {
        super();    //ù�ٿ��� ����ؾ� ��
        //�θ��� �⺻������ ������ �ļ�Ŭ������ ���� �߻���
        System.out.println("�⺻ ������ �����");
    }

    public Shape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
        System.out.println("Shape ������ �����");
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
        //���� ��� : this �� obj�� ���� �ּҰ� ������?
        //return this == o;

        //�������̵� �ϴ� ���� : �� ������ �� �ʵ尪�� ������?
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
        //���� ����� �ǹ̸� �ٲٸ� �� ��
        //this �� �����ϴ� ��ü�� ������ ������ �� ��ü�� ��ȯ�ϴ� �޼ҵ�

        //���� ����(deep copy)��� ��
        return new Shape(this.area, this.perimeter);
    }


}
