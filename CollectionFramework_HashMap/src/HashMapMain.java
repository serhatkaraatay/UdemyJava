import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        //değerleri key ve value olarak depolar
        //her key bir value'ya karşılık gelir
        //key'ler benzersizdir, value'lar tekrarlanabilir
        //elementleri HashSet gibi ekleme sırasına göre depolamaz
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(10,"Java");
        hashMap.put(30,"Python");
        hashMap.put(50,"Php");
        hashMap.put(20,"Php");
        hashMap.put(20,"C#");//aynı key ile ekleme yaparsak value güncellenir
//        System.out.println(hashMap);//karışık bir şekilde depolar
//        System.out.println(hashMap.get(10));//key ile value'ya erişme
//        System.out.println(hashMap.containsKey(10));//key var mı yoksa null döner
//        System.out.println(hashMap.containsValue("Java"));//value var mı yoksa false döner
//        System.out.println(hashMap.remove(20));//key ile value silme
        for(Map.Entry<Integer,String > entry : hashMap.entrySet()) {
            System.out.println("Anahtar : "+ entry.getKey() + " ------> Değer : " + entry.getValue());
        }
    }
}
