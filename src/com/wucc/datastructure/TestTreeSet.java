package com.wucc.datastructure;

import com.wucc.datastructure.pojo.Person;
import org.junit.Test;

import java.util.TreeSet;

public class TestTreeSet {
    /*1,TreeSet是一个有序的集合，它的作用是提供有序的Set集合。
    它继承了AbstractSet抽象类，实现了NavigableSet<E>，Cloneable，Serializable接口。
    TreeSet是基于TreeMap实现的，TreeSet的元素支持2种排序方式：自然排序或者根据提供的Comparator进行排序
     2,reeSet是一个包含有序的且没有重复元素的集合，
     通过TreeMap实现。TreeSet中含有一个"NavigableMap类型的成员变量"m，而m实际上是"TreeMap的实例"
    */


    @Test
    public  void demo01(){
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("张三", 11));
        ts.add(new Person("李四", 12));
        ts.add(new Person("王五", 15));
        ts.add(new Person("赵六", 21));

        System.out.println(ts);
        System.out.println(ts.size());
    }

}
