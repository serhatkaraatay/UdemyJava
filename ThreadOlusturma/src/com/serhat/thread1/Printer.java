package com.serhat.thread1;

public class Printer extends Thread {
    //Thread sınıfından extend ettik
    //bu class da bir thread class olarak davranacak
    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }
    //Thread olarak davranması için run methodunu override etmeliyiz

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
