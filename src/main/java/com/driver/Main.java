package com.driver;

public class Main {
    public static void main(String[] args) {
        Main.B obj=new Main.B();
        System.out.println(obj.meth());
//        System.out.println(obj.fun());
    }
    static class A{
        String meth(){
            return "Invoking method from class A";
        }
    }
    static class B extends A {
        String meth(){

            return "Method is overridden in Extendend class B";
        }

    }

}
