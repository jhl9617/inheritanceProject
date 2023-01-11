package oop.inheritance.run;

import oop.inheritance.sample.Rectangle;

public class TestInheritance3 {
    public static void main(String[] args) {
        //�������̵� �޼ҵ� �׽�Ʈ��

        Rectangle r1 = new Rectangle(10, 10);
        r1.calculator();
        System.out.println(r1);

        //���� ����(shallow copy)
        //�ٸ� ��ü�� �ּҸ� ���� �޴� ��
        Rectangle r2 = r1;

        //���� ����(deep copy) ������ ���� copy
        Rectangle r3 = (Rectangle)r1.clone();
        //��� ���迡 �ִ� Ŭ���������� ����ȯ ������
        //UpCasting : �ļ� Ÿ���� �θ� Ÿ������ �ٲٴ� ��(�ڵ�)
        //DownCasting : �θ� Ÿ���� �ļ� Ÿ������ �ٲٴ� ��(���)(�������� (Rectangle)�� ��ȯ)
        System.out.println(r3);
        System.out.println(r1.hashCode());
        System.out.println(r1.hashCode());
        System.out.println(r3.hashCode());

        //equals() Ȯ��
        System.out.println("Ȯ�� 1 : " + (r1 == r2));    //true
        //�ּҰ� ������?
        System.out.println("Ȯ�� 2 : " + (r1 == r3));     //false

        //equals() overriding : ���� ������?
        System.out.println("Ȯ�� 3 : " + (r1.equals(r3)));//true(r3�� r1�� Ŭ���̱� ������ ���� ����)

    }
}
