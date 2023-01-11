package oop.etc.test;

public class TestThisConstructor {
    public static void main(String[] args) {
        //this() ������ ��� �׽�Ʈ
        Customer c1 = new Customer(1350, "ȫ�浿", 5300, "010-1234-5678");
        System.out.println(c1.info());
        System.out.println("c1 : " + c1.hashCode());

        Customer c2 = new Customer(c1);
        System.out.println(c2.info());
        System.out.println("c2 : " + c2.hashCode());

        Customer c3 = c1;
        System.out.println(c3.info());
        System.out.println("c3 : " + c3.hashCode());
    }
}
//this() ������ ���� Ŭ����
//���� : �ڱ� Ŭ���� �ȿ��� �ٸ� �����ڸ� �����Ű�� ���� �����
//������ �ȿ��� �ٸ� �����ڸ� �����Ű�� ������
//�Ϲ������δ� ��� �� ��. �ڵ��� �ߺ��� ���̱� ���� ����� �� ����
class Customer {
    private int code;
    private String name;
    private int point;
    private String phone;

    public Customer() {}

    public Customer(int code, String name) {
        super();    //ù �ٿ��� �ۼ��� �� ����
        //�θ��� �⺻�����ڸ� ȣ����
        //this();
        this.code = code;
        this.name = name;
    }
    public Customer(int code, String name, int point, String phone) {
        //������ �ȿ��� �ٸ� ������ �����Ҷ� ���
        //Customer(name, phone);    //error
        this(code, name);   //�Ű����� 2�� �ִ� ������ ����
        //�ݵ�� ù�ٿ��� �ۼ� �ؾ� ��

        this.point = point;
        this.phone = phone;
    }

    //���� ������ :
    //������ �Ҵ�� �ν��Ͻ�(��ü)�� ���� �ʵ尪���� ���� ����� ��ü�� �����ϴ� ������
    public Customer(Customer otherRef) {
        this(otherRef.code, otherRef.name, otherRef.point,otherRef.phone);

        this.code = otherRef.code;
        this.name = otherRef.name;
        this.point = otherRef.point;
        this.phone = otherRef.phone;
    }

    //Method
    public String info() {
        return "Customer[" + code + ", " + name + ", " + point + ", " + phone + "]";
    }
}
