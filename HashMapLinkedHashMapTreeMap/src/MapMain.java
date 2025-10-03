import java.util.*;

public class MapMain {
    public static void mapYazdir( Map<Integer, String> map ) {
        map.put(10,"Java");
        map.put(30,"Python");
        map.put(50,"Php");
        map.put(20,"C");
//        for(Map.Entry<Integer,String > entry : map.entrySet()) {
//            System.out.println("Anahtar : "+ entry.getKey() + " ------> Değer : " + entry.getValue());
//        }
//        for(Integer key : map.keySet()) {
//            System.out.println("Anahtar : "+ key + " ------> Değer : " + map.get(key));
//        }
        Collection<String> values = map.values();
        for(String value : values) {
            System.out.println("Değer : " + value);
        }
    }
    public static void main(String[] args) {
        //hashap key'lere göre sıralı depolanmaz
        //linkedhashmap ekleme sırasına göre depolanır
        //treemap key'lere göre sıralı depolanır
        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();
        System.out.println("HashMap");
        mapYazdir(hashMap);
        System.out.println("------------------");
        System.out.println("LinkedHashMap");
        mapYazdir(linkedHashMap);
        System.out.println("------------------");
        System.out.println("TreeMap");
        mapYazdir(treeMap);

    }
}
