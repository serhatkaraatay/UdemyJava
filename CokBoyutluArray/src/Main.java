import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6};
        int [][] array2= new int [2][2]; //2 satır 2 sütunlu array oluşturuldu
        array2[0][0]=10;
        array2[0][1]=20;
        array2[1][0]=30;
        array2[1][1]=40; // Tüm değerler atanmıs oldu
        int[][] array3 ={{10,20},{30,40}}; //array2 ile aynı değerlere sahip array 3 bu şekilde de oluşturulabilir
        System.out.println("Array için satır sayısı giriniz : ");
        int satir = sc.nextInt();
        System.out.println("Array için  sütun sayısını giriniz : ");
        int sutun = sc.nextInt();
        int [][] array4 = new int [satir][sutun];

        for (int i = 0; i <satir; i++) {
            for(int j=0;j<sutun;j++) {
                System.out.println("Değer giriniz: ");
                array4[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<satir;i++) {
            for(int j=0;j<sutun;j++) {
                System.out.print(array4[i][j]+" ");
            }
            System.out.println(); //Matris olarak bastırıldı
        }

    }
}
