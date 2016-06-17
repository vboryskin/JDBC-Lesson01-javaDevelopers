package com.logos.JDBC;

/**
 * Created by admin on 08.06.2016.
 */
public class Person {
    private int id;
    private String name;
    private int age;

    public void Person(String name, int age){
        this.name=name;
        this.age=age;
    }


    public void Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void Person(){

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public java.lang.String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
