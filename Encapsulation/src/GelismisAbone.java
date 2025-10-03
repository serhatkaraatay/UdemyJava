//Bir değişken adında değişiklik yapmak istendiğinde sadece bu sınıfta değişiklik yapılsa yeterli oluyor diğer sınıfta değişikliğe gerek yok
public class GelismisAbone {
    private String isim;
    private int bakiye=120;
    private String sehir;
    public GelismisAbone(String isim, int bakiye, String sehir) {
        this.isim = isim;
        if(bakiye<=120 && bakiye>=0){
            this.bakiye=bakiye;
        }
        this.sehir = sehir;
    }
    public void dogalgaz_kullan(int miktar){
        if(this.bakiye < miktar){
            System.out.println("Yeterli Bakiye Yok");
        }
        else{
            this.bakiye -= miktar;
            if(this.bakiye <= 0){
                System.out.println("Bakiyeniz bitmiştir. Yükleme Yapınız..");
            }
            else{
                System.out.println("Yeni Bakiye : "+this.bakiye);
            }
        }
    }
    public void bakiye_ogren(){
        System.out.println("Güncel Bakiye: "+this.bakiye);
    }
}
