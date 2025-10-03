import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TryWithResource ne işe yarar :
        // Try-catch-finally bloklarında kaynakları (örneğin dosya, veritabanı bağlantısı) otomatik olarak kapatmak için kullanılır.
        // Kaynakları manuel olarak kapatmaya gerek kalmaz, bu da kodun daha temiz ve güvenli olmasını sağlar.
        // Try-with-resources bloğu, AutoCloseable veya Closeable arayüzünü implemente eden nesnelerle çalışır.
        // Kaynaklar try bloğunun sonunda otomatik olarak kapatılır, böylece kaynak sızıntıları önlenir.
        try (FileWriter writer1 = new FileWriter("diller.txt"))
//             FileWriter writer2 = new FileWriter("dosya2.txt")
        {//FileWriter AutoCloseable arayüzünü implemente eder
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Bir dil giriniz(Çıkış için -1 tuşlayınız) : ");
                String dil = scanner.nextLine();

                if (dil.equals("-1")) {
                    System.out.println("Program sonlandırılıyor...");
                    System.out.println("Dosyayı kontrol ediniz...");
                    break;
                }
                writer1.write(dil + "\n");
            }


//            writer2.write("Deneme");

        } catch (IOException e) {
            System.out.println(" Dosya oluşturulurken hata oluştu ");
        }
    }
}
