import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       // toplama(3,5);//string değer gönderirsek hata verir
        //generic methodlar veye classlar türden bağımsız işlem yaptığımız classlar ve methodlardır
        ArrayList<String> arraylist = new ArrayList<String>();
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>(); //türden bağımsız çalışır string de gönderilebilir Integer da
        //public class ArrayList<E> bu şekilde tanımlanmıs ArrayList sınıfı
        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"Java","Python","C++","Php"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mehmet"), new Ogrenci("Ayşse"),new Ogrenci("Mustafa")};
//        Char_yazdir.yazdir(char_dizi);
//        Integer_yazdir.yazdir(integer_dizi);
//        String_yazdir.yazdir(string_dizi);
//        Ogrenci_yazdir.yazdir(ogrenci_dizi);
        Generic_Yazdir <Character> char_yazdir = new Generic_Yazdir<Character>();
        Generic_Yazdir<Integer> integer_yazdir = new Generic_Yazdir<Integer>();
        Generic_Yazdir<String> string_yazdir = new Generic_Yazdir<String >();
        Generic_Yazdir<Ogrenci> ogrenci_yazdir = new Generic_Yazdir<Ogrenci>();
        char_yazdir.yazdir(char_dizi);
        integer_yazdir.yazdir(integer_dizi);
        string_yazdir.yazdir(string_dizi);
        ogrenci_yazdir.yazdir(ogrenci_dizi); //bir obje oluşturuluyor yazdırılacak dizi türleri için

    }
    public static void toplama(int a, int b) {
        System.out.println(a + b);
    }
}
