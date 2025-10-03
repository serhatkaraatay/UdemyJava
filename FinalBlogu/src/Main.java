public class Main {
    public static void main(String[] args) {
        // Exception oluşsa da oluşmasa da çalışacak kodlar
        //3 farklı şekilde yazılabilir try-catch-finally
        //1. try-catch+finally
        //2. try-finally
        //3. try-catch
        try{
            String s="Deneme";
            int a =30/0;
            System.out.println(s.hashCode());//NullPointerException
        }
        catch(ArithmeticException e){
            System.out.println("Bir sayı sıfıra bölünemez");
        }
        catch(NullPointerException e){
            System.out.println("Null Referans Hatası Oluştu");
        }
        finally {
            System.out.println("Finally Bloğu Çalışıyor..");//Hata olsa da olmasa da çalışır
        }
        System.out.println("Burası çalışıyor..");
    }
}
