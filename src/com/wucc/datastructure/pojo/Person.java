package com.wucc.datastructure.pojo;

public class Person implements  Comparable<Person>{
    public  String name;
    public  Integer  age;
    public Person(String name,Integer age){
          this.name = name;
          this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
