public class FinalTest {
    public final int obje_sayisi; //
    private static int say = 0;
    private final String isim;
    public FinalTest( String isim) {
      //  obje_sayisi = 5; //tanımlanırken ya da constructor içerisinde değer verilmeli ve iki defa değer verilemez
        this.isim = isim;
        say++;
        obje_sayisi=say;
    }

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        FinalTest.say = say;
    }
}
