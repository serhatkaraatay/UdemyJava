import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /*
        First in first out mantığıyla çalışan bir veri yapısıdır. FIFO
        Yani ilk eklenen ilk çıkar mantığıyla çalışır.
        Queue arayüzü java.util paketinde bulunur ve java.util.LinkedList sınıfı tarafından uygulanır.
        Queue arayüzü, aşağıdaki temel işlemleri tanımlar:
        - offer(E e): Kuyruğun sonuna bir öğe ekler. Başarılı olursa true, başarısız olursa false döner.
        - poll(): Kuyruğun başındaki öğeyi kaldırır ve döner. Kuyruk boşsa null döner.
        - peek(): Kuyruğun başındaki öğeyi döner ancak kaldırmaz. Kuyruk boşsa null döner.
        - isEmpty(): Kuyruğun boş olup olmadığını kontrol eder.
        - size(): Kuyruktaki öğe sayısını döner.
        - element(): Kuyruğun başındaki öğeyi döner ancak kaldırmaz. Kuyruk boşsa bir istisna fırlatır.
        - remove(): Kuyruğun başındaki öğeyi kaldırır ve döner. Kuyruk boşsa bir istisna fırlatır.
        - add(E e): Kuyruğun sonuna bir öğe ekler. Başarılı olursa true döner, başarısız olursa bir istisna fırlatır.
        add ve offer arasındaki fark, add başarısız olursa bir istisna fırlatırken, offer false döner.
        poll ve remove arasındaki fark, poll boş kuyrukta null dönerken, remove bir istisna fırlatır.
        peek ve element arasındaki fark, peek boş kuyrukta null dönerken, element bir istisna fırlatır.
         */
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");
       // System.out.println(queue.peek()); // Java gösterir

//
//        for(String s: queue){
//            System.out.println(s);
//        }
   //     System.out.println("Çıkarılan eleman: " +queue.poll()); // Java çıkartır ve ekrana yazdırır
        System.out.println("**********************");
        for(String s: queue){
            System.out.println(s);
        }
        System.out.println(queue.isEmpty());// false döner çünkü kuyruk boş değil
        while(!queue.isEmpty()){
            System.out.println("Çıkarılan eleman: " +queue.poll());
        }
    }
}
