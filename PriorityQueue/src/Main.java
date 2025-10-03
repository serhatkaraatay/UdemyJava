import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player>{
    @Override
    public int compareTo(Player o) {
        if(this.id < o.id){
            return -1;//en düşük id en yüksek önceliğe sahip olur.
        }
        else if(this.id > o.id){
            return 1;
        }
        else{
            return 0;
        }
    }
    private String name;
    private int id;
    public Player(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "isim: " + this.name + ", id: " + this.id;
    }
}
public class Main {
    public static void main(String[] args) {
        /*
        PriorityQueue : Nomal queue yapısından farkı elemanları öncelik sırasına göre tutar.
        Integerlarda örnek verecek olursak, 1 en yüksek önceliğe sahip eleman olurken, 10 en düşük önceliğe sahip eleman olur.
        Stringlerde ise alfabetik olarak sıralama yapılır.
        Elemanlar doğal sıralamalarına göre veya bir Comparator kullanılarak sıralanır.
        En yüksek önceliğe sahip eleman her zaman kuyruğun başında bulunur.
        1. Eleman ekleme: add() veya offer() metotları kullanılarak eleman eklenir.
        2. Eleman çıkarma: poll() metodu en yüksek önceliğe sahip elemanı çıkarır ve döner.
        3. Eleman görüntüleme: peek() metodu en yüksek önceliğe sahip elemanı döner ancak çıkarmaz.
        4. Boş kontrolü: isEmpty() metodu kuyruğun boş olup olmadığını kontrol eder.
        5. Boyut öğrenme: size() metodu kuyruğun eleman sayısını döner.
        6. Eleman arama: contains() metodu belirli bir elemanın kuyruğun içinde olup olmadığını kontrol eder.
        7. Tüm elemanları temizleme: clear() metodu kuyruğun tüm elemanlarını temizler.
        8. Dönüştürme: toArray() metodu kuyruğun elemanlarını bir diziye dönüştürür.
        9. İterasyon: iterator() metodu kuyruğun elemanları üzerinde dolaşmak için bir iterator döner.
        10. Comparator kullanma: Farklı bir sıralama düzeni için özel bir Comparator sağlanabilir.
         */
        Queue<Integer> queue = new PriorityQueue<Integer>();
        Queue<Player> playerQueue = new PriorityQueue<Player>();
        playerQueue.offer(new Player("Ahmet", 3));
        playerQueue.offer(new Player("Zeynep", 1));
        playerQueue.offer(new Player("Mehmet", 2));
        while(!playerQueue.isEmpty()){

            System.out.println(playerQueue.poll()); //id si en düşük olan en önce çıkar.
            //toString metodunu override etmezsek Player@1b6d3586 gibi referans değerlerini yazdırır.
            //override ettiğimiz için isim ve id değerlerini yazdırır.
        }
//        queue.offer(100);
//        queue.offer(5);
//        queue.offer(10);
//        queue.offer(2);
//        queue.offer(30);
//        queue.offer(50);
//        System.out.println(queue.peek());
//        System.out.println(queue.contains(50)); //true döner
//        for(Integer i: queue){
//            System.out.println(i);
//        } //for dongüsü ile yazdırdığımızda öncelik sırasına göre değil, ekleme sırasına göre yazdırır.
//        while(!queue.isEmpty()){
//            System.out.println("Eleman cıkarılıyor: " + queue.poll());
//        }// while döngüsü ile yazdırdığımızda öncelik sırasına göre yazdırır.

    }
}
