public class Main {
    public static void main(String[] args) {
        /*
        List Interface'i implemente eden classlar

        Elementleri liste halinde depolar.
        Bir element birden fazla bulunabilir.
        Elementler indeks ile tutulur.
        Elementler eklenme sırasını korur.
        Bir elemanı aramak çok yavaştır.
        Bir elemana indeks değeri ile ulaşmak hızlıdır.
        Listeler Collections.sort() metoduyla sıralanabilir.

        Thread işlemlerinde kullanılabilecek Veri Yapısı
        Vectorler ---> bazı methodları "synchronized" anahtar kelimesiyle yazılmıstır.

        Elemanı Sadece Sona Eklediğimiz Durumlarda
        ArrayList ---> Çünkü sadece sona eklemek  arraylistlerde daha hızlıdır

        Elemanı Ortaya Ekleyebileceğimiz Durumlar Varsa
        LinkedList ---> Çünkü sadece o bölgenin referansları üzerinde işlem yapılır.
        ----------------------------------------------------------------------------------------------------------------
        Set Interface'i implemente eden classlar

        Bir elemanı sadece bir defa depolar
        Bir elemanın sadece bir defa depolanmasını istiyorsak Listeler(ArrayList,LinkedList vs) yerine kullanılabilir.
        Elemanlar listler gibi indekslenmezler
        Bir elemanı setlerde olup olmadığını sorgulama listlere göre oldukça hızlıdır.

        Elemanların Sırası Önemli Değilse ve Sorgulama İşlemlerinin hızlı olması isteniyorsa
        HashSet ---> Elemanları Ekleme sırasına göre depolamaz ve bir elemanın olup olmadığını sorgulama
        hash fonksiyonuyla yapıldığı için her zaman hızlı ve sabit zamanda çalışır.

        Elemanların Eklenme Sırası Önemliyse ve Sorgulama İşlemlerinin Hızlı Olması İsteniyorsa

        LinkedHashSet ---> LinkedList ve HashSet implementasyonu gibi çalıştığı için değerleri ekleme sırasına göre depolar.
        Ayrıca elemanları sorgulama çok hızlıdır ve sabit zamanda çalışır.

        Elemanların Sıralanması Önemliyse

        TreeSet ---> Verileri ağaç yapısında depoladığı için veriler her zaman sıralıdır. Acak bir elemanın var olup
        olmadığını sorgulama zamanı içindeki eleman sayısıyla doğru orantılıdır. (O(logn))

        Eğer Kendi Objelerimizi setlerde kullanmak istiyorsak hashCode() ve equals() metodlarını override etmeliyiz.
        ----------------------------------------------------------------------------------------------------------------

        Map Interface'ini Implemente Eden Classlar

        Veriler Anahtar Değer ilişkisiyle depolanır.
        Bir Key'e karşılık gelen yalnızca bir değer bulunur.
        Bir key birden fazla bulunamaz.
        Bir depere bir key üzerinden erişmek çok hızlıdır.
        Değerlerin üzerinde tek tek gezmek çok yavaştır.
        Eğer kendi objelerimizi maplerde kullanmak istiyorsak hashCode() ve equals() metodlarını override etmeliyiz.

        HashMap

        Anahtarlar ve değerler sıralı değildir.

        LinkedHashMap

        Anahtarlar ve değerler ekleme sırasına göre depolanır.

        TreeMap

        Abahtarlar ve değerler "Anahtarlara göre" Sıralı Depolanır.

        ----------------------------------------------------------------------------------------------------------------

        Queue Interface'ini Implemente Eden Classlar

        LinkedList

        Eğer Queue Interface'inden bir referans ile LinkedList oluşturulursa bu LinkedList aynı zamanda
        bir Queue gibi davranır.

        First in First Out mantığıyla çalışır.

        PriorityQueue

        Queue Interface'ini implemente etmesine rağmen First in First Out mantığıyla çalışmaz. Değerler öncelik sırasına
        göre kuyruğun başına geçer.
        ----------------------------------------------------------------------------------------------------------------

        Vector Classından Extend eden Stackler

        LIFO (Last in First Out) mantığıyla çalışır. Bilgisayarlarda Recursif Fonksiyonlar çalıştırılırken kullanılır...
        ----------------------------------------------------------------------------------------------------------------

        Kendi Objelerimizle Oluşturduğumuz bir Veri Yapısını Sıralamak

        Collections.sort() metoduyla kendi Objelerimizle oluşturduğumuz bir ver yapısını sıralamak için ya Comparable
        Interface'ini ya da Comparator Interface'ini implemente etmek zorundayız.
        ----------------------------------------------------------------------------------------------------------------

        Iteratorlar ve Iterable

        Bir veri yapısından iterator oluşturarak veri yapısının elemanları üzerinden kolayca gezinebiliriz.
        Aslında For Each döngüsü kendi içinde iterator kullanır.
        O yüzden bizim de bir classımızdan oluşturduğumuz objelerin üzerinde gezinebilmemiz için Iterable Sınıfını
        implemente etmemiz ve Classımıza ait bir tane iterator class yazmamız gerekmektedir.




         */
    }
}
