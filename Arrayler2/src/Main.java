import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int [] arrayi_doldur(int sayi){
        Scanner input = new Scanner(System.in);
        int [] array = new int[sayi];
        for(int i=0;i<sayi;i++){
            System.out.print("Sayı Giriniz: ");
            array[i] = input.nextInt();
        }
        return array;
    }
    public static void arrayi_yazdir(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void arrayi_sirala(int [] array){
        //Arrays sınıfından bir metod kullanılarak yapılacak
        Arrays.sort(array);
    }
    public static void main(String[] args) {
        System.out.print("Kaç elemanlı bir array istersiniz : ");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int [] cikti = arrayi_doldur(sayi);
        System.out.print("Oluşturulan Dizi : ");
        arrayi_yazdir(cikti);
        arrayi_sirala(cikti);
        System.out.println();
        System.out.print("Sıralanan Dizi : ");
        arrayi_yazdir(cikti);
        int [] a1 = {1,2,3,4,5,6};
        int [] a2 = {1,2,3,4,5,6};
        if(a1==a2){
            //Bu durumda if koşuluna girmez eşitler yazısını göremeyiz sebebi farklı yerleri referans gösterirler
            //Arrays.equals ile içindeki değerler karşılaştırılabilir ve eşitler çıktısı verir. 
            System.out.println("Eşitler");
        }
        }
}
