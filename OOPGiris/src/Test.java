public class Test {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
       // araba1.model= "Toyota";
       // araba1.kapilar= -4; // Tehlikeli durum (encapsulation yapılarak önlenebilir) özellikler private olmalı
        araba1.setModel("Renault");
        araba1.setKapilar(-4);// kapı sayısı negatif olamaz! hatası verir atama yapılmaz
        araba1.setRenk("Kırmızı");
        araba1.setMotor("1.6 Benzinli");
        System.out.println("Araba Modeli: " + araba1.getModel());
     //   Araba araba2;
      //  araba2.setKapilar(10); // Bu satır hata verecektir çünkü araba2 henüz bir nesne olarak tanımlanmadı
        Araba araba3 = null;
        araba3.setModel("Renault");//NullPointerException hatası verir çünkü araba3 null referansına sahiptir
    }
}
