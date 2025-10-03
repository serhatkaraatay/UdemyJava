public class Test {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("VS197E","ASUS","18.5",resolution);
        Kasa kasa = new Kasa("Shadow Blade ","Shadow","Temperli CVam");
        Anakart anakart = new Anakart("B250-Pro","Asus",10,"Windows 10");
        Bilgisayar pc = new Bilgisayar(monitor,kasa,anakart);
        pc.getKasa().bilgisayari_ac(); //get kasa ile kasa objesinin referansına ulaşıyoruz ve fonksiyonu çağırabiliyoruz
        pc.getMonitor().monitoru_kapat();
        pc.getAnakart().isletim_sistemi_yukle("Ubuntu 16.04");
        // Has A İlişkisi var Inheritance ya0parken is A ilişkisi vardı 
    }
}
