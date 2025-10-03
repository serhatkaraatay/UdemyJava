public class PcMuhendisi implements IMuhendis {
    private boolean askerlik;
    private  boolean adli_sicil;

    public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if(askerlik){
            System.out.println("Askerlik Yapılmıştır");
        }
        else{
            System.out.println("Askerlik yapılmadı ...");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalama : " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil){
            System.out.println("Adli Sicil Kaydı Bulunuyor");
        }
        else{
            System.out.println("Herhangi bir adli sicil kaydı bulunmuyor");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("Bilgisayar Mühendisi olarak şu şirketlerde çalıştım..");
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
