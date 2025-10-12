import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockOrnek {
    private int say = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void artir() {
        for (int i = 0; i < 10000; i++) {
            say++;
        }
    }

    public void thread1Fonksiyonu() {
        lock.lock();// kilit alındı
        System.out.println("Thread 1 uyandırılmayı bekliyor");
        try {
            condition.await();// kilit serbest bırakılır ve beklemeye geçer
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 1 uyandırıldı işleme devam ediliyor");
        artir();
        lock.unlock();

        //exception oluşursa kilit serbest bırakılmaz
        // bu yüzden try-catch-finally bloğu kullanılır
//        try{
//            artir();// kritik bölüm
//        }
//        finally {
//            lock.unlock();// kilit serbest bırakıldı


    }

    public void thread2Fonksiyonu() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        lock.lock();
        System.out.println("Thread 2 çalışıyor");
        artir();
        System.out.println("Devam etmek için bir tuşa basın");
        scanner.nextLine();

        condition.signal();// bekleyen thread uyandırıldı
        System.out.println("Thread 1 uyandırılıyor");
        lock.unlock();

    }

    public void threadOver() {
        System.out.println("say değişkeni değeri : " + say);
    }
}
