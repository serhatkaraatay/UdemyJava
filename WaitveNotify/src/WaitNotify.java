import java.util.Objects;
import java.util.Scanner;

public class WaitNotify {
    private Object lock = new Object();

    public void thread1Method() {
        synchronized (lock) {//bunun yerine Objeect kullanılabilir
            System.out.println("Thread 1 çalışıyor...");
            System.out.println("Thread 1 Thread2'yi bekliyor...");
            try {
                lock.wait();// Thread1 burada bekliyor
                // Thread2 notify() ile uyandıracak
                // Thread1 uyandığında buradan devam edecek

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 1 devam ediyor...");
            System.out.println("Thread 1 işini bitirdi.");
        }
    }

    public void thread2Method() {
        Scanner input = new Scanner(System.in);
        try {
            Thread.sleep(2000);//thread 1 anahtara sahip olsun diye
            synchronized (lock) {
                System.out.println("Thread 2 çalışıyor...");
                System.out.println("Devam etmek için bir tuşa basın...");
                input.nextLine();
                lock.notify();// Thread1'i uyandırır

                System.out.println("Thread 1 uyandırıldı 2 saniye bekle");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
