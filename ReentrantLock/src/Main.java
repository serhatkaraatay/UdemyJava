public class Main {
    public static void main(String[] args) {
        ReentrantLockOrnek reentrantLockOrnek = new ReentrantLockOrnek();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockOrnek.thread1Fonksiyonu();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockOrnek.thread2Fonksiyonu();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        reentrantLockOrnek.threadOver();

    }

}
