public class StaticClass {
    public static int obje_sayisi = 0; //bellekte birdefa oluşturulacak ve her nesne oluşturulduğunda 1 artırılacak
    //static yapmasaydık bu özellik classa değil objeye özgü olacaktı ve her seferinde o objeye özgü oluşacaktı değeri 0 olacaktı
    //obje oluşturulmadan static alana erişilebilir.
    private static String isim;
    public StaticClass(){

        obje_sayisi++;
    }
    public static String getIsım(){
        return isim; //isim değişkeni static olmalı
    }
}
