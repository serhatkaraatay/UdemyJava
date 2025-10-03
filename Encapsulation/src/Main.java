public class Main {
    // bir sınıfın detaylarının başka bir sınıftan gizlenmesi
    //private yapmak örnek sayılır.
    public static void main(String[] args) {
            Abone abone = new Abone();
            abone.isim="Mustafa";
            abone.bakiye= 200;
            abone.sehir="Ankara";
            abone.dogalgaz_kullan(200);
            GelismisAbone abone1 = new GelismisAbone("Murat", 200, "Ankara");
            abone1.bakiye_ogren(); // constructor kontrolü ile bakiyeye rastgele değer verilmesinin önüne geçildi
    }
}
