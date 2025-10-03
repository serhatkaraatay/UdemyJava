public class Main {
    public static void main(String[] args) {
        //Final anahtar kelimesi ile tanımlanan bir özelliğin değeri sadece 1 defa verilebilir.
        //Başka bir yerde bu özelliğin değeri değiştirilemez.
        //ttanımlanırken ya da obje oluştururken verilebilir.
        //Değeri değiştirmneye calıştıgımızda hata alırız
//        FinalTest f1= new FinalTest("Obje 1");
//        FinalTest f2= new FinalTest("Obje 2");
//        System.out.println("Obje Sayısı: "+f1.obje_sayisi);
//        System.out.println("Obje Sayısı: "+ f2.obje_sayisi);
     //   System.out.println(Math.PI); //Math.PI değeri de daha sonradan değiştirilemez
        System.out.println("Database ismi : "+ Database.databaseIsmi);
        System.out.println("Username : "+ Database.userName);
        System.out.println("Password : "+ Database.password); //değiştirilemez değerler

    }
}
