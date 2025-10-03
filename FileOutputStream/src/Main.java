import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file = new File("dosya.txt"); //dosya açılırken içerik varsa her seferinde silinir
        try {
            fos = new FileOutputStream(file, true); // true eklenirse dosyanın sonuna ekleme yapar içeriği silmez
//            byte[] b = {101,75,66,68};
            String s = "Merhaba Dünya";
            byte [] s_array = s.getBytes(); //stringi byte arraye çevirir
            try {
                fos.write(65);
                //        fos.write(b);
                fos.write(s_array);
            } catch (IOException e) {
                System.out.println("Dosyaya yazılırken hata oluştu");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file Not found exception");
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken hata oluştu");
            }
        }
        //  fos = new FileOutputStream("text.txt");

    }
}
