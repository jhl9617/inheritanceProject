package com.uni;

public class Student extends Human{

    private String number;
    private String major;

    public Student() {
    }

    public Student(String name, int age, int height, int weight, String number, String major) {
        super(name, age, height, weight);
        this.number = number;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                ", major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", printInformation='" + printInformation() + '\'' +
                "} " + super.toString();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
