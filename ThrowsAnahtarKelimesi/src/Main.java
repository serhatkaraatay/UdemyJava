import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void mekan_kontrol(int yas) throws IOException {
        if (yas < 18) {
    //        throw new ArithmeticException();//Unchecked Exception
            throw new IOException();//Checked Exception durumunda Throws kullanilir
        } else {
            System.out.println("Mekana Hosgeldiniz");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");
        int yas = input.nextInt();
//        try {
//            mekan_kontrol(yas); //Checked Exception durumunda try-catch kullanilabilir
//        } catch (IOException e) {
//            System.out.println("IOException oluustu.. ");
//        }
        mekan_kontrol(yas); //Checked Exception durumunda Throws kullanilir ve main methodunda da throws IOException eklenir
        //Bir Api'ye dönüştürürken bu yöntem tercih edilir
        //Api olarak kullanacak olan kişi hatayı handle etmek zorundadir
    }
}
