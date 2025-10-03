public class Main {
    public static void main(String[] args) {
        /*
        try {
            // Exception Oluşturabilecek kodlar
        } catch (Exception e) {
            Exception yakalandığında çalışacak kodlard
//         */
//        //int a = 30/0;//Unchecked Exception
//        //int[] array = {1, 2, 3};
//        //System.out.println(array[6]);//Unchecked Exception
//        try{
//            //int a= 40/0; //Aritmetic Exception
//            int [] array = {1, 2, 3};
//            System.out.println(array[6]);//ArrayIndexOutOfBoundsException
//        }
//        catch (ArrayIndexOutOfBoundsException e){//{Exception e} de yazılabilir
//            e.printStackTrace();//Hata mesajını verir
//           // System.out.println("Array'in boyutunu aştınız");
//        }
//        System.out.println("Burası calısıyor"); // Bu kısım çalışmaz çünkü yukarıda hata var // try catch kullanılırsa çalışır
//        // printstackTrace kullanılırsa hata mesajını verir ve program çalışmaya devam eder

        try {
            int[] array = {1, 2, 3};
            System.out.println(array[6]);//ArrayIndexOutOfBoundsException
            int b = 30 / 0; //Aritmetic Exception
        } catch (ArithmeticException e) {
            System.out.println("Bir sayi 0'a bölünemez");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array'in boyutunu aştınız"); //aynı anda sadece bir tane catch çalışır
            //catch blokları özelden genele doğru yazılmalı
            //herhangi bir exception oluşmazsa catch blokları çalışmaz
            //kod calışmaya devam eder
        } catch (Exception e) {
            System.out.println("Bir hata oluştu.."); //iki farklı hata için tek catch kullanılabilir
            e.printStackTrace();
        }

    }
}
