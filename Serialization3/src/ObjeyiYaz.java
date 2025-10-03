import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args) {

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {
            Ogrenci ogrenci1 = new Ogrenci("Ali Veli", 123, "Bilgisayar Mühendisliği");
            Ogrenci ogrenci2 = new Ogrenci("Ayşe Fatma", 456, "Elektrik-Elektronik Mühendisliği");
            Ogrenci.setOgrenci_sayisi(100);//static alanı değiştirdik
            output.writeObject(ogrenci1);//nesneyi dosyaya yaz
            output.writeObject(ogrenci2);//nesneyi dosyaya yaz
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu");
        }
    }
}
