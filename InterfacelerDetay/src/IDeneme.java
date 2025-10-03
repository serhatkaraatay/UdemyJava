public interface IDeneme {
    public int a = 4;// private bir alan interface içerisinde tanımlanamaz
    //   public int b; değer atanmalı bu şekilde tanımlanamaz
    public static String deneme = "deneme";
    public final int c = 6;
    public static void deneme(){
        System.out.println("deneme");
    }
}
