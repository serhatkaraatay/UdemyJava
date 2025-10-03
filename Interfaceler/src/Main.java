public class Main {
    public static void main(String[] args) {
        //çoklu kalıtımın yaptığı işi yapmak için
        //interface'lerden nesne oluşturulamaz
        //implement eden classlara referans olabilir
        //final ve static değişkenler tanımlanabilir sadece
        //implemente eden classlar için bir çatı görecvi görür
        // bir class birden fazla interface implement edebilir.
        //  IMuhendis muhendis1 = new IMuhendis()// Interface'den bir obje oluşturulamaz hata verir
//        PcMuhendisi muhendis1 = new PcMuhendisi(false, false);
//        muhendis1.adli_sicil_sorgula();
//        muhendis1.askerlik_durumu_sorgula();
//        System.out.println(muhendis1.mezuniyet_ortalamasi(2.5));
//        String[] tecrube = {"Vestel", "Havelsan", "Turksat"};
//        muhendis1.is_tecrubesi(tecrube);
        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false);
        String[] tecrube = {};
        String[] referanslar = {"Mustafa murat","Serhat Say"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.24));
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referas_getir(referanslar);
    }
}

