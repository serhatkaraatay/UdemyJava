public class Main {
    public static void ortalama_bul(int[] arr ){
        int temp= 0;
        for(int i=0; i<arr.length; i++){
            temp+=arr[i];
        }
        System.out.println("Ortalama değer : " + (double)temp/arr.length); //çıktıyı double olarak yazdırdık
    }
    public static void arrayi_yazdir(int[] arr){
//       for(int i=0;i<arr.length;i++){}
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int [] a; //
        a = new int[10]; // 10 adet int türünde değer depolanacak demek oluyor
        a[0] = 1; //değerler atıyoruz indeksler aracaılığıyla
        a[1] = 2;
        a[2] = 3;
        int [] arr = {1,2,3,4,5,6,7,8,9,10}; //arrayı tanımlarken değerler atandı
        System.out.println("Array boyutu : " +arr.length);
        arrayi_yazdir(arr);
        System.out.println();
        ortalama_bul(arr);
    }
}