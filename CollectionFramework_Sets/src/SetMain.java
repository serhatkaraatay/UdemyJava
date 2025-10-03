import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
    //set interface = hashset, linkedhashset, treeset
    //objeler üretildiğinde bir elementten sadece 1 tane olabilir
        //hash fonksiyonuna göre depolar
    //hashset zaman karmasıklığı O(1)
    //treeset zaman karmasıklığı O(logn)
    //Linkedhashset zaman karmaşıklığı O(1)
    Set<String> set1 = new HashSet<String>();
    Set<String> set2 = new LinkedHashSet<String>();
    Set<String> set3 = new TreeSet<String>();
//    //HashSet
//    set1.add("Java");
//    set1.add("Python");
//    set1.add("C++");
//    set1.add("Javascript");
//    set1.add("Php");
//    //LinkedHashSet
//    set2.add("Java");
//    set2.add("Python");
//    set2.add("C++");
//    set2.add("Javascript");
//    set2.add("Php");
//    //TreeSet
//    set3.add("Java");
//    set3.add("Python");
//    set3.add("C++");
//    set3.add("Javascript");
//    set3.add("Php");
//    System.out.println("HashSet****************************************");
//    set1.remove("Java");
//    for (String s : set1) {
//        System.out.println(s);//rastgele depolar
//    }
//        System.out.println("LinkedHashset****************************************");
//    for (String s : set2) {
//        System.out.println(s);//ekleme sırasına göre depolar
//    }
//        System.out.println("TreeSet****************************************");
//    for(String s: set3){
//        System.out.println(s);//alfabetik sıraya göre depolar
//    }
//        System.out.println(set1.contains("Go"));
//        System.out.println(set2.contains("Java") );
//        System.out.println(set1.isEmpty());
//        set1.remove(0);
    Set<String> setyeni = new HashSet<String>();
    Set<String> setyeni2 = new HashSet<String>();
    setyeni.add("Java");
    setyeni.add("Python");
    setyeni.add("C++");
    setyeni.add("Javascript");
    setyeni.add("Php");
    setyeni2.add("Go");
    setyeni2.add("Java");
    setyeni2.add("CSS");
    Set<String > fark = new HashSet<String>(setyeni2);
    System.out.println(fark.removeAll(setyeni));
    System.out.println("Fark Kümesi" + fark);
    Set<String> kesisim= new HashSet<String>(setyeni2);
    System.out.println(kesisim.retainAll(setyeni));//kesişim ile set1in kesişimi var mı
    System.out.println("Kesişim Kümesi" + kesisim);


    }

}
