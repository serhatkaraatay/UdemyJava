public class KapsamSinifi2 {
    private int privateDegisken = 30;
    KapsamSinifi2() {

    }
    public void dahiliSinifKontrol(){
        DahiliSinif d = new DahiliSinif();
        //direkt erişim sağlanır .
        System.out.println("Kontrol ediliyor .. "+ d.a);
    }
    public class DahiliSinif{
        //sınıf içerisinde de değişken tanımlarsak for içerisinde ve sınıf içerisindeki methotta bu değer kullanılır.
        private int a = 3 ;
        public void OnileCarp() {
            //method içerisinde de tanımlarsak bu değer kullanılır en lokal değer kullanılır .
            for (int i = 1; i < 6; i++) {
                System.out.println(i + " * " + privateDegisken + " = " + (privateDegisken * i));//this ile belirtirsek DahiliSınıf içerisinde tanımlanan değer kullanılır
            }//KapsamSınıfı2 içerisindeki değişkeni kullanmak istersek KapsamSinifi2.this. şeklinde kullanmak gerekir.

        }
    }
}
