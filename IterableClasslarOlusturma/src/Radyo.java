import java.util.ArrayList;
import java.util.Iterator;

public class Radyo implements Iterable<String> {

    private ArrayList<String> kanalListesi = new ArrayList<String>();
    public Radyo(String[] kanallar) {
        for (String kanal : kanallar) {
            kanalListesi.add(kanal);
        }

    }

    @Override
    public Iterator<String> iterator() {
        return kanalListesi.iterator();
    }
}
