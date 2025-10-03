import java.io.Serializable;

public class Ogrenci implements Serializable {

    private String ad; //String tipindeki özelliği transient yaparsak varsayılan değeri null olur
    private int id; // id alanını transient yaptık
    //transient anahtar kelimesi, bu alanın serileştirilmemesini sağlar
    //yani bu alan dosyaya yazılmaz ve dosyadan okunmaz
    //bu alanın değeri, nesne dosyadan okunduktan sonra varsayılan değeri alır
    //int için varsayılan değer 0'dır
    private String bolum;
    private static int ogrenci_sayisi=0;//static alanlar serileştirilmez
    //static alanlar, sınıfa aittir, nesneye değil
    //bu yüzden static alanlar dosyaya yazılmaz ve dosyadan okunmaz
    //static alanların değeri, program çalıştığında sınıf yüklendiğinde başlatılır
    //static alanların değeri, nesne dosyadan okunduktan sonra değişmez

    public Ogrenci(String ad, int id, String bolum) {
        this.ad = ad;
        this.id = id;
        this.bolum = bolum;
    }

    public static int getOgrenci_sayisi() {
        return ogrenci_sayisi;
    }

    public static void setOgrenci_sayisi(int ogrenci_sayisi) {
        Ogrenci.ogrenci_sayisi = ogrenci_sayisi;
    }

    @Override
    public String toString() {
        return "Öğrenci İsmi: "+ad+
                "\nÖğrenci Numarası: "+id+
                "\nÖğrenci Bölümü: "+bolum;
    }

}
