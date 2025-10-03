public class Main {
    public static void main(String[] args) { //proje oluşturulurken bellekte bir main metodu oluşturulmalı
        //eğer static kaldırılırsa bellekte direkt oluşturulmaz ve hata alırız
        //Static anahtar kelklimesi ile yazdıldığında bu özellikler ve metotlar objeye bağlı değil sınıfa bağlı özellikler veya metotlar oluyor
        // Direkt olarak sınıf ismi üzerinden erişilebiliyor.
        //Obje oluşturmayta gerek kalmıyor program çalıştığında bellekte direkt oluşurlar.
        //Sınıfa ait oldukları için sadece 1 kere oluşturulurlar.
        Seyirci seyirci1 = new Seyirci("Oğuz");
        Seyirci seyirci2 = new Seyirci("Mustafa");
        seyirci1.oyun_seyret();
        seyirci2.oyun_seyret();
        System.out.println("Seyirci Sayısı : " + Seyirci.getSeyirci_sayisi());
        //System.out.println("Seyirci Sayısı : " + seyirci1.seyirci_sayisi);//obje üzerindend e erişilebilir
        //selamla(); static olan bir metottan static olmayan bir metot çağıuramayız hata verir .(proje çalışmaya başladığında selamla oluşturulmaz)
        System.out.println(Math.PI);//Static bir PI değişkenine sınıf üzerinden eriştik

    }
    public void selamla(){
        System.out.println("Selamlar...");
    }
}
