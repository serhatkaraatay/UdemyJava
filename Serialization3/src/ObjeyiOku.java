
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))){
            Ogrenci ogrenci1= (Ogrenci)in.readObject();//Objeye dönüştürülmüş halini Öğrenci tipine cast ettik
            Ogrenci ogrenci2= (Ogrenci)in.readObject();

            System.out.println(ogrenci1);
            System.out.println("******************");
            System.out.println(ogrenci2);
            System.out.println("Ogrenci sayısı: "+Ogrenci.getOgrenci_sayisi());//static alanın değeri değişmedi 0 yazar
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı");
        }
    }
}
