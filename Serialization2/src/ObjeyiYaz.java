import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Ali Veli", 123, "Bilgisayar Mühendisliği");
        Ogrenci ogrenci2 = new Ogrenci("Ayşe Fatma", 456, "Elektrik-Elektronik Mühendisliği");
        Ogrenci ogrenci3 = new Ogrenci("Zeynep Can", 769, "Endüstri Mühendisliği");

        Ogrenci[] ogrenci_array = {ogrenci1, ogrenci2, ogrenci3};//dizi oluşturduk
        ArrayList<Ogrenci> ogrenci_list = new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array));//diziyi listeye dönüştürdük


        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))) {
            out.writeObject(ogrenci_array);
            out.writeObject(ogrenci_list);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu");
        }
    }
}
