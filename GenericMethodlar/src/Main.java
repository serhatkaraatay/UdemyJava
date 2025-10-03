public class Main {
    public static void main(String[] args) {
//        Character [] char_dizi = {'J','A','V','A'};
//        Integer [] integer_dizi = {1,2,3,4,5,6};
//        String [] string_dizi = {"Java","Python","C++","PHP"};
//        Ogrenci [] ogrenci_dizi = {new Ogrenci(),new Ogrenci()};
//        yazdir(char_dizi);
//        yazdir(integer_dizi);
//        yazdir(string_dizi);
//        yazdir(ogrenci_dizi);
//    }
//    public static <E> void  yazdir(E [] dizi ){
//        for(E e:dizi){
//            System.out.println(e);
//        }
        Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
        Sayisal sayisal2 = new Sayisal(25, 45, 2, 35);
        Sayisal birinci = birinci(sayisal1, sayisal2);

        EsitAgirlik esitAgirlik1 = new EsitAgirlik(30,20,40,2);
        EsitAgirlik esitAgirlik2 = new EsitAgirlik(40,10,50,0);
        EsitAgirlik esitAgirlik3 = birinci(esitAgirlik1, esitAgirlik2);
        System.out.println("Birinci Sayısal Öğrencinin puanı: "+ birinci.puan_hesapla());
        System.out.println("Birinci Eşit Ağırlık Öğrencinin Puanı: "+ esitAgirlik3.puan_hesapla());

  }


    public static <E extends Aday> E birinci(E e1, E e2) {
        if(e1.puan_hesapla()> e2.puan_hesapla()) {
            return e1;
        }
        else {
            return e2;
        }
    }

}
