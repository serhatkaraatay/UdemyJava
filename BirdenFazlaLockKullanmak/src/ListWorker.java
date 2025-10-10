import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class ListWorker {
    Random rand = new Random();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void list1DegerEkle() {
        synchronized (lock1) {
            //synchronized (this) { //bu şekilde de yapılabilir ama bu durumda diğer synchronized bloklarla da çakışır
            //yani list1'e erişen thread list2'ye de erişemez
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list1.add(rand.nextInt(100));//0 ile 100 arasında random sayı ekler
        }
    }


    public void list2DegerEkle() {
        synchronized ((lock2)) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(rand.nextInt(100));
        }

    }


    public void degerAta() {
        for (int i = 0; i < 1000; i++) {
            list1DegerEkle();
            list2DegerEkle();
        }
    }

    public void calistir() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                degerAta();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                degerAta();
            }
        });
        long baslangic = System.currentTimeMillis();

        t1.start();
        t2.start();
        try {
            t1.join();//t1'in bitmesini bekler
            t2.join();//t2'nin bitmesini bekler

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("List1 size: " + list1.size() + " List2 size: " + list2.size());
        long bitis = System.currentTimeMillis();
        System.out.println("Geçen süre: " + (bitis - baslangic));
    }

}
