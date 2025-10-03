import java.util.Scanner;

public class main {
    public static void mekan_kontrol(int yas){
        if (yas<18){
            throw new ArithmeticException();
        }
        else{
            System.out.println("Mekana hoşgeldiniz..");
        }
    }
    public static void main(String[] args) {
        //Throw Anahtar Kelimesi istemli olarak bir istisna fırlatmak için kullanılır.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        try{
            mekan_kontrol(yas);
        }
        catch(ArithmeticException e){
            System.out.println("18 yaşından küçükler mekana giremez..");
        }

    //    System.out.println("sonlandı..");//bu satır çalışmaz yukarıda hata fırlatıldığında
    }
}
