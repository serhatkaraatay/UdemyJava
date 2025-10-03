import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        txt dosyalarında filereader veya bufferedreader kullanılır
        daha hızlı çalışır
         1- FileReader: tek tek karakter okur
         2- BufferedReader: satır satır okur
         3- Scanner: kelime kelime okur
         4- Files: tüm dosyayı tek seferde okur
         5- Apache Commons IO: tüm dosyayı tek seferde okur (dış kütüphane)
         6- Google Guava: tüm dosyayı tek seferde okur (dış kütüphane)
         7- NIO: tüm dosyayı tek seferde okur (Java 7 ve üzeri)
         */
        /*
        bufferreader kullanırsak satır satır okuruz
        filereader kullanırsak karakter karakter okuruz
        kendi içerisinde buffer oluşturur
        dosyaya daha az erişim olur
        daha hızlı çalışır
         */
        /*try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")));)//try with resources
        {
            //büyük dosyalarda bufferreader kullanmak daha mantıklı
            //scanner ile okuma
            while (scanner.hasNextLine()) {
                String ogrenci_bilgisi = scanner.nextLine();
                String[] array = ogrenci_bilgisi.split(" - ");
                if (array[1].equals("Bilgisayar Mühendisliği")) {
                    System.out.println("Öğrenci bilgisi : " + ogrenci_bilgisi);
                }
//                System.out.println("Okunan satır: " + scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası");
        }*/
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true)))//true ekleme yapar
        {
            writer.write("Ahmet Yılmaz - Bilgisayar Mühendisliği\n");

        } catch (IOException e) {
            System.out.println("Dosya yazma hatası");
        }
    }
}
