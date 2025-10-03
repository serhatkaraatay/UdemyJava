public class Test {
    public static void main(String[] args) {
        Account hesap = new Account();
        Account hesap2 = new Account("754545", "Ahmet", 1000.0, "ahmet2131@gmail.com", "05555555555");

        Account hesap3 = new Account("Ahmet can", "Ahmet@gmail.com", "055454845"); // bu çıktı hesap3'e atanıyor .
        hesap2.bilgileriGoster();
        hesap3.bilgileriGoster();
        //3 farklı constructor kullanıldı ve duruma göre farklı parametreler verildi.
        Account hesap4 = hesap3; // hesap3'ün referansı hesap4'e atanıyor, yani hesap4 artık hesap3 ile aynı nesneyi gösteriyor.
        Account hesap5=new Account();
        if(hesap3 == hesap5) {
            System.out.println("hesap3 ve hesap4 aynı nesneyi gösteriyor."); //bellekte aynı objeyi gösteriyorlar. hesap 4 ve hesap3
        } else {
            System.out.println("hesap3 ve hesap4 farklı nesneleri gösteriyor."); //hesap 3 ve 5 kontrolü yaparsak else bloğuna girer çünkü hesap3 ve hesap5 farklı nesneleri gösteriyor.
        }
        new Account("Ahmet demir","example@gmail.com","054541545").bilgileriGoster();// Bu satırda yeni bir Account nesnesi oluşturuluyor, ancak bu nesneye herhangi bir referans atanmıyor. Yani bu nesneye erişim sağlanamayacak ve çöp toplayıcı tarafından temizlenecek.
        //bilgileriGoster() metodu çağrılıyor, bu nedenle nesne oluşturulduktan sonra bilgileri konsola yazdırılacak.


    }
}
