public class MakineMuhendisi implements IMuhendis,ICalisma {
    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik) {
            System.out.println("Askerlik Yapılmıştır");
        } else {
            System.out.println("Askerlik yapılmadı ...");
        }

    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortlama: " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adli_sicil) {
            System.out.println("Adli Sicil Kaydı Bulunuyor");
        } else {
            System.out.println("Herhangi bir adli sicil kaydı bulunmuyor");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {
        if (array.length == 0) {
            System.out.println("Herhangi bir iş tecrübesi bulunmuyor.");
        } else {
            System.out.print("Makine mühendisi olarak şu şirketlerde çalıştım: ");
            for (String s : array) {
                System.out.print(s + " , "); //forEach kullanılarak yazıldı
            }
            System.out.println();
        }
    }

    public void referas_getir(String[] array) {
        if (array.length == 0) {
            System.out.println("Herhangi bir referas bulunmuyor.");
        } else {
            System.out.print("Referanslar : ");
            for (String s : array) {
                System.out.print(s + " , ");
            }
            System.out.println();
        }

    }

    @Override
    public void calis() {
        System.out.println("Makine mühendisi çalışıyor..");
    }
}
