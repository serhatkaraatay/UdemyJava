package com.serhat.thread2;

public class Printer implements Runnable {
    //Runnable interface'ini implement ettik
    //bu class da bir thread class olarak davranacak
    //Çalışması için bir Thread objesi oluşturup bu objeye verilmeli
    //örneğin: Thread t1 = new Thread(new Printer("printer1"));

    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println("" + this.isim + " thread çalışıyor");
        for (int i = 0; i < 10; i++) {
            System.out.println(this.isim + " : " + i);
            try {
                Thread.sleep(1000); //1 saniye bekle
            } catch (InterruptedException e) {//InterruptedException kontrol edilebilir bir exceptiondır
                System.out.println("Thread kesintiye uğradı");//Herhangi hata durumunda burası çalışır
            }
        }
        System.out.println(this.isim + " işini bitirdi");
        //1 saniyede 1 çalısması için Thread.sleep() kullanabiliriz
    }
}
