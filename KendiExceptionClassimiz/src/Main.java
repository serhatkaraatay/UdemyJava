import java.util.Scanner;

public class Main {
    public static void mekan_kontrol(int yas) throws InvalidAgeException {
        if(yas<18){
            throw new InvalidAgeException("Invalid Age: " + yas);
        }
        else{
            System.out.println("Yaşınız uygundur.");
        }
    }
    public static void main(String[] args) {
        //Bir üst sınıftan türetilmeli
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();
//        try{
//            mekan_kontrol(yas);
//        }
//        catch (InvalidAgeException e){
//            System.out.println(e);
//        }
//        mekan_kontrol(yas);
        try{
            mekan_kontrol(yas);
        }
        catch (InvalidAgeException e){
            e.printStackTrace();
        }

    }
}
