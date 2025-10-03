public class Generic_Yazdir <E> { //farklı türde veri tipleri için tek bir diziyi yazdırma methodu kullanıldı
    public void yazdir(E[] dizi) {
        for(E e : dizi) {
            System.out.println(e);
        }
    }
}
