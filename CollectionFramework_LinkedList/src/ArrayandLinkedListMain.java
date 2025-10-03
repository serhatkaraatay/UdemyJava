import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayandLinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        ArrayList<Integer> arraylist = new ArrayList <Integer>();
        //iki classın metodları  benzer
        //verileri depolama şekilleri farklı
        //Arraylist arka planda array kullanır
        //Linkedlist ise node yapısı kullanır
        //Arraylist index yapısı kullanır
        //Linkedlist ise pointer yapısı kullanır
        zamanhesapla("LinkedList", list);
        zamanhesapla("ArrayList", arraylist);

    }
    public static void zamanhesapla(String veri_tipi, List<Integer> list){
        //Listin sonunda değer ekleme
        long baslangic;
        long bitis;
        baslangic = System.currentTimeMillis();
        for(int i=0; i<100000;i++){
            list.add(0,i);
        }
        bitis = System.currentTimeMillis();//for döngüsünün ne kadar sürdüğünü ölçer
        System.out.println(veri_tipi + " ekleme süresi: " + (bitis-baslangic) + " ms");
    }
}
