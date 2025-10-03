import java.util.*;

public class Main {
    /*
    ListIterator
    Sadece List arayüzünü implemente eden sınıflarda kullanılabilir.
    Vectorlerde,stacklerde, ArrayListlerde ve LinkedListlerde kullanılabilir.
    next(), previous(), hasNext(), hasPrevious(), nextIndex(), previousIndex(), remove(), set(E e), add(E e) metotlarını içerir.
    Iterator'dan farkı, çift yönlü dolaşım yapabilmesidir.
        1. next() : İteratörün konumunu bir sonraki elemana kaydırır ve o elemanı döner.
        2. previous() : İteratörün konumunu bir önceki elemana kaydırır ve o elemanı döner.
        3. hasNext() : İteratörün bir sonraki elemanı olup olmadığını kontrol eder.
        4. hasPrevious() : İteratörün bir önceki elemanı olup olmadığını kontrol eder.
        5. nextIndex() : İteratörün bir sonraki elemanının indeksini döner.
        6. previousIndex() : İteratörün bir önceki elemanının indeksini döner.
        7. remove() : İteratörün son döndüğü elemanı koleksiyondan kaldırır.
        8. set(E e) : İteratörün son döndüğü elemanını belirtilen elemanla değiştirir.
        9. add(E e) : İteratörün konumuna belirtilen elemanı ekler.
     Iterator:
     Set,Queue ve List arayüzlerini implemente eden sınıflarda kullanılabilir.
     HashSetlerde,TreeSetlerde, LinkedHashSetlerde, PriorityQueue'larda, ArrayListlerde ve LinkedListlerde kullanılabilir.
     next(), hasNext(), remove() metotlarını içerir.
     Sadece tek yönlü dolaşım yapabilir.
     */
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");
        set.add("Ruby");
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Ruby");
        ListIterator<String> listIterator = list.listIterator();
        Iterator<String> iterator1 = set.iterator();
      //  Iterator<String> iterator2 = list.iterator();
        //iterator sadece ileriye doğru hareket edebilir.
//        while (iterator1.hasNext()) {
//            System.out.println(iterator1.next());
//        }
//        System.out.println("**********");
//        while (iterator2.hasNext()) {
//            System.out.println(iterator2.next());
//
//        }
        //tekrar iterator2.next() yaparsak hata verir çünkü sona gelmişizdir.

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("**********");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        while(listIterator.hasNext()){
            String value=listIterator.next();
            if(value.equals("C++")){
                listIterator.remove();
            }
        }
        System.out.println("**********");
        //C++ elemanını sildik
        for(String value:list){
            System.out.println(value);
        }
    }
}
