import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void yazdir (ArrayList<String> liste) {
        for (String s : liste){//forEach ile yazdırıldı
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        //Arraylerin genişletilebilir hali denebilir
        ArrayList<String> arrayList = new ArrayList<String>();//arraylist oluşturuldu ve içerisi boş
        arrayList.add("Metalica");//0.indeks
        arrayList.add("Guns And Roses");
        arrayList.add("Black Sabbath");
        arrayList.add("Iron Maiden");//3.indeks
        System.out.println(arrayList.get(0));//0. indeksteki elemanı yazar
        System.out.println(arrayList.size());//kaç eleman olduğu öğrenilir
        System.out.println(arrayList.indexOf("Guns And Roses")); //kaçıncı indekste olduğu yazdırılır.
        System.out.println(arrayList.lastIndexOf("Guns And Roses")); // elemandan birden fazla olursa listede en son gördüğü yerdeki indeks yazdırılır
        //indexOf methodu listede bulamazsa -1 döndürür
        arrayList.remove("Metalica"); //Metalica arraylistten silinir
        // arrayList.remove(1);//1. indekteki elemani siler. İki şekilde de remove methodu kullanılabilir
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.set(0, "Iron Man");// Belirtilen indekse yeni eleman atanır(Guns And Roses yerine Iron Man yazıldı)
        yazdir(arrayList);
    }

}
