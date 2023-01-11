package oop.inheritance.run;

import oop.inheritance.sample.Rectangle;

public class TestInheritance2 {
    public static void main(String[] args) {
        //��ӱ������� ������ ȣ�� ����
        //�θ�Ŭ������ �ʵ�� �޼ҵ常 ��ӹް� ��
        //������, �ʱ���� ��� �� ��

        Rectangle rectangle = new Rectangle();
        //�θ������ ���� ����ǰ� ����, �ļջ����� �۵� Ȯ����

        System.out.println(rectangle.toString());
        Rectangle rectangle1 = new Rectangle(10,20);
        Rectangle rectangle2 = new Rectangle(20,20,400,100);

        //�޼ҵ� ���  ���� �� ��� + �θ��� public �޼ҵ� ���
        //�θ��� public �� �ƴ� protected �� default, private �� �ļ� Ŭ���� �ȿ��� ��� �� �� ����
        System.out.println(rectangle1);
        rectangle1.calculator();
        System.out.println(rectangle1);

        //�θ� �޼ҵ� ��� : �ڽ��� ��ó�� ����ϸ� ��
        rectangle.setWidth(2);
        rectangle.setHeight(3);
        rectangle.calculator();
        System.out.println(rectangle);


    }
}
