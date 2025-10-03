public class Main {
    public static void main(String[] args) {
        /*
        Önceki inner classlarda classın bir üyesiydi
        Lokal inner classlar methodların bir üyesi oluyor method içerisinde tanımlayabiliyoruz
        başka methodlardan erişilemez methoda özgüdür
        public static gibi ana kelimeler kullanılamaz
        Bir class tanımlanacaksa ve sadece o method içerisinde kullanılacaksa direkt lokal inner class tanımlanabilir
         */
        class Alan{ //lokal inner class public ya da static yazamayız ön kısma
            public void daire_alan(int yaricap){
                System.out.println("Dairenin alanı : " + (yaricap*yaricap*Math.PI));
            }
        }
        Alan alan = new Alan();
        Alan alan2 = new Alan();
        alan.daire_alan(10);
        alan2.daire_alan(5);
    }
    public static void deneme(){
      //  Alan alan1 = new Alan(); Lokal inner classa buradan erişim sağlanamaz. önceki methoda özgüdür bu methoddam erişilemez

    }
}
