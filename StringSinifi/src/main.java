public class main {
    public static void main(String[] args) {
//        String a = "Hello World";
//        String b = new String("Hello World"); //
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println("Harf Sayısı : " + b.length());
//        System.out.println("0. indeks : " + b.charAt(0));
//
//        for (int i = 0; i < b.length(); i++) {
//            System.out.print(b.charAt(i) + " ");
//        }
//
//        System.out.println("\n" + b.startsWith("Hello")); // Hello ile başlıyorsa true döner başlamıyorsa false döner
//        System.out.println(b.endsWith("S")); // bitişi kontrol eder
//        System.out.println(b.indexOf("e")); // olmayan bir değer yazarsak -1 döner
//        System.out.println(b.lastIndexOf("o"));
//        System.out.println(b.toLowerCase()); // tüm karakterler küçük harfe çevrilir.
//        String c = "1923";
//        int d = Integer.parseInt(c); // int'e çevrilir
//        System.out.println(d);
//        int x = 19321;
//        String y = String.valueOf(x);  //string'e çevrilir.
        String a1 = "abc";
        String a2 = "abc";
        if(a1==a2){
            System.out.println("Eşitler"); // true çalışır Eşitler yazar ekrana
        }
        String b1 = new String("abc");
        String b2 = new String("abc"); //değerler eşit fakat referanslar farklı olur bu sefer
        if(b1==b2){
            System.out.println("Eşitler");//farklı yerleri gösterirler ve eşitler ekrana yazdırılmaz
        }
        if(b1.equals(b2)){
            System.out.println("Eşitler"); //içeriği aynı mı diye kontrol edilir ve eşitler yazdırılır .
        }
    }
}
