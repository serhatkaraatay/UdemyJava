import java.io.Serializable;

public class Ogrenci implements Serializable {
    //Serializable interface'ini implement etmeliyiz
    //serializable interface'i, bir nesnenin byte stream'e dönüştürülmesini sağlar
    //böylece nesne dosyaya yazılabilir veya ağ üzerinden gönderilebilir
    //serializable interface'i bir marker interface'tir, yani içinde metod yoktur
    //sadece nesnenin serializable olduğunu belirtir
    private static final long serialVersionUID = 2000;//sürüm numarası
    //sürüm numarası, nesnenin hangi sürümde olduğunu belirtir
    //sürüm numarası, nesnenin yapısı değiştiğinde değiştirilmelidir
    //sürüm numarası, nesnenin eski sürümlerle uyumlu olup olmadığını kontrol etmek için kullanılır
    //sürüm numarası, nesnenin eski sürümlerle uyumlu değilse, InvalidClassException hatası fırlatılır
    //sürüm numarası, nesnenin eski sürümlerle uyumlu ise, nesne başarıyla okunur
    private String ad;
    private int id;
    private String bolum;
    private String dersler;//bu alanı ekledik

    public Ogrenci(String ad, int id, String bolum) {
        this.ad = ad;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Öğrenci İsmi: "+ad+
                "\nÖğrenci Numarası: "+id+
                "\nÖğrenci Bölümü: "+bolum;
    }

}
