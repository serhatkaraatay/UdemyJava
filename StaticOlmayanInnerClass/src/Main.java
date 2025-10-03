import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        (Inner classlar)Dahili sınıflar berlirli görevi yapan classların başka classın içinde gruplanması ile oretaya çıkar
        Çoklu kalıtım sağlanabilir.
        Statik olmayan inner, statik inner , lokal inner class, anonim inner classlar


         */
        Matematik.Factorial faktoriyel = new Matematik().new Factorial();//önce matematik oluşturuluyor sonra factorial
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();
        Matematik.Alan.DarireAlan alan2 = new Matematik().new Alan().new DarireAlan();
        Scanner input = new Scanner(System.in);
        System.out.println("Bir tane sayı giriniz: ");
        int sayi = input.nextInt();
        if(asal.asal_mi(sayi)){
            System.out.println("Sayı Asaldır");
        }
        else{
            System.out.println("Sayı asal değildir");
        }
        faktoriyel.faktoriyel();
      //  alan.daire_alan(5);
        alan2.daire_alan(6);
     }
}
