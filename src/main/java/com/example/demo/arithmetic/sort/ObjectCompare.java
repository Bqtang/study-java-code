package com.example.demo.arithmetic.sort;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2021/1/1 12:02 PM
 */

public class ObjectCompare {

     public static void main(String[] args) {
          Person  person1 = new Person("老大", 1);
          Person  person2 = new Person("老二", 2);
          person1.compareTo(person2);

     }

}

class Person implements Comparable<Person>{

     private String name;
     private Integer age;

     public Person(String name, Integer age){
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
     public int compareTo(Person other) {
         return this.age - other.age;
     }

     @Override
     public String toString() {
          return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
     }
}
