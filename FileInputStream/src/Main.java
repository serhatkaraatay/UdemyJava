import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("dosya.txt");
//            System.out.println("Birinci Karakter: " + (char)(fis.read()));
//            System.out.println("İkinci Karakter: " + (char)(fis.read()));
//            System.out.println("Üçüncü Karakter: " + (char)(fis.read()));
//            fis.skip(5);//5 byte atla
//            System.out.println("Okunan karakter: " + (char)(fis.read())); //5 byte atladıktan sonraki karakteri okur
            //  fis.read();// tek seferde 1 byte okur
            //byte cinsinden değer döner
            int deger;
            String s = "";
//            while ((deger = fis.read()) != -1) { //dosya sonuna gelene kadar oku
//                s += (char) deger; //okunan byteı stringe çevirip ekle
//            }
//            System.out.println("Dosya içeriği: " + s); //dosya sonuna gelince -1 döner ve döngü biter
            int say= 0;
            fis.skip(5);
            while(say<11 && (deger = fis.read()) != -1){ //5 karakter oku
                s += (char) deger;
                say++;
            }
            System.out.println("Dosya içeriği: " + s);
        } catch (FileNotFoundException e) {
            System.out.println("file Not found exception");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluştu");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }

            } catch (IOException e) {
                System.out.println("Dosya kapatılırken hata oluştu");
            }
        }
    }


}

