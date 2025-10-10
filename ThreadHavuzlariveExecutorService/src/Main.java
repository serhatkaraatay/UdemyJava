import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        //Daha önce olan uygulamalarda sadece 3 adet thread vardı.
        //Büyük projelerde yüzlerce thread olabilir.
        //Thread'leri yönetmek için ExecutorService kullanılır.
        //ExecutorService, thread havuzu (thread pool) oluşturur ve thread'leri yönetir.
        //Thread havuzu, belirli sayıda thread oluşturur ve bu thread'ler görevleri (task) alır ve çalıştırır.
        //Thread havuzu, sistem kaynaklarını daha verimli kullanır ve performansı artırır.
        //Thread havuzu, görevleri sıraya alır ve sırayla çalıştırır.
        //Thread havuzu, görevlerin tamamlanmasını bekler ve ardından kapatılır.

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //maksimum 2 thread olacak şekilde bir thread havuzu oluşturuldu.
        for (int i = 0; i <= 5; i++) {
            executorService.submit(new Worker(String.valueOf(i), i));
            //o anki i değerini String'e çevirip Worker sınıfına gönderiyoruz.

        }
        executorService.shutdown();//yeni görev kabul etmeyi durdurur.
        System.out.println("TÜm işler teslim edildi..");
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);//1 gün boyunca tüm görevlerin tamamlanmasını bekler.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tüm işler bitti..");
        //executorService.shutdown() ile thread havuzunu kapatıyoruz.
        //shutdown() metodu, havuzdaki tüm görevlerin tamamlanmasını bekler ve ardından havuzu kapatır.
        //shutdown() metodu çağrıldıktan sonra yeni görevler eklenemez.
        //shutdown() metodu çağrıldıktan sonra havuzdaki tüm thread'ler sonlandırılır.



        /*Thread t1 = new Thread(new Worker("1",1));
        Thread t2 = new Thread(new Worker("2",2));
        Thread t3 = new Thread(new Worker("3",3));
        Thread t4 = new Thread(new Worker("4",4));
        Thread t5 = new Thread(new Worker("5",5));
        System.out.println("Tüm işler teslim edildi..");
        //başlat
        t1.start();
        t2.start();
        //bitmesini bekle
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t5.start();
        try {
            t5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tüm işler bitti.."); */

    }
}
