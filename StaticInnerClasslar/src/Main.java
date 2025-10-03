public class Main {
    public static void main(String[] args) {
        //Matematiği başlatmaya gerek olmuyor onu başlatmadan alan classsından referans oluşturuyoruz
        //Matematik.Alan alan1 = new Matematik().new Alan(); static olmayanda bu şekildeydi
        Matematik.Alan alan = new Matematik.Alan();//
        alan.daire_alan(10);
        Matematik.Alan.daire_alan(10);//static method yaptıığımızda bu şekilde de kullanabiliriz.
    }
}
