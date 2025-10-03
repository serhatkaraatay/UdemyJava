import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<String>();
        List<String> list = new ArrayList <String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.size());//kaç eleman olduğunu yazdırır.
        for(int i = 0; i <list.size(); i++){
            System.out.println(list.get(i));//listeyi yazdırma
        }
        for (String s : list) {
            System.out.println(s);   //listeyi ekrana forEach ile yazdırma
        }
        list.remove(0); //eleman silme ("A") şeklinde de direkt eleman silinebilir.
    }
}
