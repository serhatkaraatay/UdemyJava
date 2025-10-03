public abstract class Sekil {
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
    public void ismini_soyle(){
        System.out.println("Bu obje "+ isim + " objesidir...");
    }
    abstract void alan_hesapla(); // alt sınıflar bu methodu yazmak zorunda

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
