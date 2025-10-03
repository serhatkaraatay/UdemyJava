public class Main {
    public static void main(String[] args) {
        /*
                    Override edilmesi gereken methodların bir classta biriktirilip alt classlarda kullanılmasını sağlar
                    Interface ile inheritance arası bir yapı
                    Objeler opluşturulamaz ama referansları alt sınıflara referans olabilir
                    Gövdeli ve gövdesiz öethodlar bir arada olabilir
                    Özellik eklenebilir
                    1 tane gövdesiz method bulundurmalı
                    Alt sınıflarda kullanılması gereken method abstract olmalı
         */
        //Sekil sekil = new Sekil("Sekil"); Hata verir bu şekilde obje oluşturamayız
        Sekil sekil;
        sekil = new Kare("Kare2 ", 6); // alt sınıflara referans olabilir
        Kare kare1 = new Kare("Kare1",5);
        Daire daire1 = new Daire("Daire1",3);
        kare1.alan_hesapla();
        daire1.alan_hesapla();
        kare1.cevre_hesapla();
    }
}
