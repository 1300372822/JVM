package com.sgg.jvm.heap;

public class TestTransferValue {
    //int
    public void changeValue1(int age){
        age = 30;
    }
    //String
    public void changeValue2(String str){
        str = "after_Str";
    }

    public static void main(String[] args) {
        TestTransferValue test = new TestTransferValue();
        int age = 20;
        test.changeValue1(age);
        System.out.println(age);
        String str = "pre_str";
        test.changeValue2(str);
        System.out.println(str);


        String s1 = "firstStr";
        s1="secondStr";
        System.out.println(s1);

        Person person = new Person("preName");
        test.changeValue3(person);
        //此处输出afterName
        System.out.println(person.name);
        Person person2 = new Person("oldName");
        test.changeValue4(person2);
        //此处输出oldName 因为栈中存放对象的引用
        System.out.println(person2.name);
    }

    private void changeValue4(Person person2) {
        person2 = new Person("newPerson");
        System.out.println("方法中"+person2.name);
    }
    //Object
    public void changeValue3(Person person){
        person.name="afterName";
    }
}

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }
}
