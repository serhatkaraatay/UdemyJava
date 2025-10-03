package com.serhat.thread2;

public class Main {
    public static void main(String[] args) {
        //herhangi bir thread oluşturmadan main thread çalışır
        System.out.println("Main thread çalışıyor");
        Thread thread1 = new Thread(new Printer("printer1"));
        Thread thread2 = new Thread(new Printer("printer2"));
        thread1.start(); //start methodu run methodunu çağırır ve thread başlar
        thread2.start();
        System.out.println("Main thread işini bitirdi");
    }
}
