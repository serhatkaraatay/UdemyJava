import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        //ArrayList <int> arrayList1 = new ArrayList<int>(); //int bir referans olarak sayılmıyor gönderilemiyor ilkel bir veri tipidir
        // boolean char byte short int long float double ilkel veri tpleri
        //Boolen Character Integer Short Byte Long Float Double
        Integer a = 10;
       //Integer ile tanımladığımızda Integer fonksiyonları önerilir
        ArrayList <Integer> arraylist2 = new ArrayList<Integer>();
        /*for (int i = 0; i < 10; i++) {
            arraylist2.add(Integer.valueOf(i*4));//AutoBoxing İlkel bir i*4 dediğimizde java otomatik yapıyor
        }
        for (int i = 0; i < arraylist2.size(); i++) {
            System.out.println(arraylist2.get(i).intValue());//referansı alıp intValue alınıyor Unboxing sadece get(i) yazıldığında java otomatik çeviriyor
        }

      */
    }


}
