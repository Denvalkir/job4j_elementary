package ru.job4j.calculator;

public class ArgMethod {
    public static  void hello(String name, int age) {
        System.out.println("Hello, " + name + " " + age);
    }
    public static void main(String[] args) {
        String name = "Denis Fazlutdinov";
        int age = 30;

        //ArgMethod.hello();

        ArgMethod.hello(name, age);

        //ArgMethod.hello(age);

        //ArgMethod.hello(name, name, name);
    }
}
