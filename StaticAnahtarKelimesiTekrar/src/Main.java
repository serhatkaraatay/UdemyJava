public class Main {
    public static void main(String[] args) {
        StaticClass s1 = new StaticClass();
        StaticClass s2 = new StaticClass();
        System.out.println("Obje Sayısı : " + StaticClass.obje_sayisi);
        System.out.println("Obje Sayısı : " + s1.obje_sayisi);
        toplama(3,4,5);
    }
    public static void toplama(int a ,int b, int c){ //static olmalı yukarıda kullanabilmek için
        System.out.println(a+b+c);
    }

}
