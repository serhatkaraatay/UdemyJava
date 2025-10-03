import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //FileWriter kullanarak bir txt dosyasına nasıl veri yazılır
        //FileInputStream ve FileOutputStream kullanıldığında ekstradan dönüştürme işlemi yapılması gerekir
        //FileWriter kullanıldığında ise direk string olarak yazılabilir
        //FileINputStream ve FileOutputStream mp4 gibi binary dosyalar için kullanılır
        FileWriter writer = null;//Eğer try catch içinde tanımlanırsa finally bloğunda erişilemez
        //try catch içerisinde dosya açma işlemi yapılırsa finally bloğunda kapatma işlemi yapılabilir
        try {
            writer = new FileWriter("dosya.txt",true);
            // true parametresi ile açılırsa dosyanın sonuna ekleme yapar
            // false parametresi ile açılırsa dosyanın içeriğini siler ve yeniden yazar
            // parametre verilmezse default olarak false kabul edilir
//            writer.write("Hello World\n"); //parantez içerisine göderilebilecek veriler : string, char dizisi, int dizisi
//            writer.write("Merhaba Dünya\n");
              writer.write("Oğuz Artıran\n");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu " );
        }
        finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken bir hata oluştu " );
            }
        }

    }
}
