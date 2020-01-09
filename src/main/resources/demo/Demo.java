package me.yaol.clog;

import java.util.List;

/**
 * @author: TuGai
 * @createTime: 2020-01-07 22:59
 **/
public class Demo {

    private static String staticName = "static_name";

    private String name;
    private int age;


    public Demo(int age) {
    }

    public static void main(String[] args) {
        Demo cLogDemo = new Demo(2);
    }

    public String clogTest(String name, int age, List<String> list) {
        String s = name + age;
        return s;
    }

}
