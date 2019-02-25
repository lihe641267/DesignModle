package com.lt.gold.designmodle.bean;

/**
 * Creat by ${user} on ${date}
 */
public class Student {
    private int age;
    private int height;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private Student(Builder builder){
        this.age=builder.age;
        this.height=builder.height;
        this.name=builder.name;
    }

    public static  class Builder{
        private int age;
        private int height;
        private String name;

        public Builder age(int age){
            this.age=age;
            return this;
        }
        public Builder height(int height){
            this.height=height;
            return this;
        }
        public Builder name(String name){
            this.name=name;
            return this;
        }

        public Student Build(){
            return new Student(this);
        }
    }
}
