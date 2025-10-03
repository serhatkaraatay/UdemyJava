package com.serhat.thread1;

public class Main {
    public static void main(String[] args) {
        //herhangi bir thread oluşturmadan main thread çalışır
        System.out.println("Main thread çalışıyor");
        Printer printer1 = new Printer("printer1");
        Printer printer2 = new Printer("printer2");
        printer1.start(); //start methodu run methodunu çağırır ve thread başlar
        printer2.start();
        //printer1.run(); //böyle yaparsak thread oluşturmuş olmayız
        System.out.println("Main thread işini bitirdi");
    }
}
