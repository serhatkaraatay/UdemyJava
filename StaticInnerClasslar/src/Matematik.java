public class Matematik {
    private static double PI = Math.PI;
    public static class Alan{
        public static void daire_alan(int yaricap){
     //       System.out.println("Daire alanı : " + (yaricap*yaricap*PI)); static bir method static olmayan değişkeni direkt kullanamaz
            System.out.println("Daire alanı : " + (yaricap*yaricap*PI)); //değişkeni static yaptığımızda burada da kullanabilitoruz
        }
    }
}
