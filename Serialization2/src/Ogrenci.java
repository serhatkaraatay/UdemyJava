import java.io.Serializable;

public class Ogrenci implements Serializable {
    private String ad;
    private int id;
    private String bolum;

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
