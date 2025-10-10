public class Main {
    public static void main(String[] args) {
        /*ListWorker worker = new ListWorker();
        long baslangic = System.currentTimeMillis();
        worker.degerAta();
        long bitis = System.currentTimeMillis();
        System.out.println("Geçen süre: " + (bitis-baslangic));*/
        ListWorker listWorker = new ListWorker();
        listWorker.calistir(); //2000 değer eklemesini bekledik ama gerçekleşmedi çünkü threadler aynı anda çalıştı
        // ve aynı anda listelere erişmeye çalıştı
        //bu yüzden liste boyutları 2000 olmadı
        //çözüm için synchronized kullanılır
        //geçen süre de artar
        //birden fazla lock objesi kullanarak bu süreyi azaltabiliriz
        //böylece threadler aynı anda farklı locklara erişebilir
        //örneğin list1değerEkle metodu lock1'i kullanırken
        //list2değerEkle metodu lock2'yi kullanırsa
        //iki thread de aynı anda çalışabilir
        //örneğin bir thread list1'e erişirken diğeri list2'ye erişebilir
        //böylece performans artar
        //geçen süre azalır
        //sonuç olarak threadlerin aynı anda çalışabilmesi için
        //farklı lock objeleri kullanmak faydalı olabilir
    }
}
