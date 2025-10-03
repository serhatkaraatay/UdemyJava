import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void listeyi_bastir(LinkedList<String> gidilecek_yerler){
//        for (String gid : gidilecek_yerler) {
//            System.out.println(gid);
//        }
        ListIterator<String> listIterator = gidilecek_yerler.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
    public static void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni){
                ListIterator<String> listIterator = gidilecek_yerler.listIterator();
                while(listIterator.hasNext()){
                    int karsilastir = listIterator.next().compareTo(yeni); //değer eşitse karsıilastir = 0 yeni daha küçükse karsilastir 0dan büyük çıkar.
                    if(karsilastir==0){
                        System.out.println("Listenizde bu eleman bulunuyor.");
                        return; //sadece metodu sonlandırmak için
                    }
                    else if(karsilastir<0){ //gönderilen değer daha büyükse iterator ilerletilir işlem yapılmaz
                        // Yeni değer daha büyüktür
                    }
                    else if(karsilastir>0){
                        //iteratoru geri alacağız bu değerden önceye ekleyeceğiz
                        listIterator.previous();
                        listIterator.add(yeni);
                        return;
                    }
                }
                listIterator.add(yeni);
    }
    public static void main(String[] args) {
        //
//        ArrayList<String> diller = new ArrayList<String>();
//        diller.add("Java");
//        diller.add("PHP");
//        diller.add("Python");
//        diller.add("Kotlin");
//        diller.add("C#");
//        //1. indekse C++ eklemek istiyoruz
//        diller.add(1,"C++");
//        for (String s : diller) {
//            System.out.println(s);
//        }
//        LinkedList<String> diller2 = new LinkedList<String>(); //her eleman bir referans taşıyor ve diğer elemanı gösteriyor.
//        //bu referanslar iki yönlüdür ve son elemanın bir referansı null değer gösterir.
//        //Art arda olmak zorunda değil . LinkedList daha fazla bellek kullanır hem değer hem diğer objenin referansını taşır
          LinkedList <String> gidilecek_yerler = new LinkedList<String>();
          gidilecek_yerler.add("Postane");
          gidilecek_yerler.add("Market");
          gidilecek_yerler.add("Okul");
          gidilecek_yerler.add("Kütüphane");
          gidilecek_yerler.add("Spor Salonu");
          gidilecek_yerler.add("Ev");
          listeyi_bastir(gidilecek_yerler);
        System.out.println("----------------------");
        gidilecek_yerler.add(4,"Alışveriş Merkezi");
        gidilecek_yerler.remove(3);
        listeyi_bastir(gidilecek_yerler);
        sirali_ekle(gidilecek_yerler,"Hastane"); //Hastane sıraya uygun şekilde eklendi

        listeyi_bastir(gidilecek_yerler);
    }
}
