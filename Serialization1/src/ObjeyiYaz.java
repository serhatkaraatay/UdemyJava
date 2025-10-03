import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args) {

        //nesneleri dosyaya yazmak için ObjectOutputStream kullanırız
        //ObjectOutputStream, OutputStream'in bir alt sınıfıdır
        //OutputStream, byte stream'leri yazmak için kullanılır
        //ObjectOutputStream ise nesneleri byte stream'e dönüştürür ve yazar
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {
            Ogrenci ogrenci1 = new Ogrenci("Ali Veli", 123, "Bilgisayar Mühendisliği");
            Ogrenci ogrenci2 = new Ogrenci("Ayşe Fatma", 456, "Elektrik-Elektronik Mühendisliği");
            output.writeObject(ogrenci1);//nesneyi dosyaya yaz
            output.writeObject(ogrenci2);//nesneyi dosyaya yaz
            //okuma işlemi için ObjectInputStream kullanılır
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu");
        }
    }
}
