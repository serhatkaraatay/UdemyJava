package com.serhat.thread3;

public class Main {
    //Anonim sınıf ile thread oluşturma
    public static void main(String[] args) {
/*
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 çalışıyor");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread1 : " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread1 kesintiye uğradı");
                    }
               }
          }
      }
        );
        thread1.start();*/
        new Thread(new Runnable() { //thread1 referansını kullanmayacaksak bu şekilde de yapabiliriz
            @Override
            public void run() {
                System.out.println("Thread1 çalışıyor");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread1 : " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread1 kesintiye uğradı");
                    }
                }
            }
        }
        ).start();//Bir defa kullanilabilecek thread için bu şekilde de yapabiliriz
        //başka bir yerde kullanılamaz
        System.out.println("Main Thread çalışıyor");

    }
}
