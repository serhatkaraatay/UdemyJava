public class Main {
    public static void main(String[] args) {
        WaitNotify wn = new WaitNotify();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.thread1Method();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.thread2Method();
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


    }

}
