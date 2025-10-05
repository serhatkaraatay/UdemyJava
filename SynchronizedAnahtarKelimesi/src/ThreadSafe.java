public class ThreadSafe {
    private int count = 0;
    public synchronized void arttir() {
        count++;
        //synchronized ile bu methoda aynı anda sadece 1 thread erişebilir
        //böylece count değişkeni thread safe olur
        //sychronized methodlar performans açısından maliyetlidir

    }

    public void threadleriCalistir () {
        //2 adet thread olacak ve her biri count'u 5000 kez arttıracak
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    arttir();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    arttir();
                    //count değişkeni thread safe değil, bu yüzden sonuç beklediğimiz gibi olmayabilir
                    //çözüm: synchronized kullanmak
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();//threadlerin bitmesini bekliyoruz
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Count değişkeninin değeri: " + count);//count değeri artmaz çünkü threadler aynı anda çalışıyor

    }

    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.threadleriCalistir();

    }
}
