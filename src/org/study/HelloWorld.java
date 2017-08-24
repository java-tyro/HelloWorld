package org.study;

public class HelloWorld {
    public static void main(String[] args) {
        synchronized (HelloWorld.class) {
            System.out.println(new HelloWorld().sayHello());
        }
        System.out.println(new HelloWorld().sayHello("Bill"));
        System.out.println(new HelloWorld().sayHello("Eric"));

    }

    private String sayHello() {
        return "Hello";
    }

    private String sayHello(String name) {
        return String.format("Hello %s", name);
    }


}


