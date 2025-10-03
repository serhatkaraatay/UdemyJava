class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan Konusuyor";
    }
}

class Kedi extends Hayvan {
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Miyavlıyor";
    }
}

class Kopek extends Hayvan {
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Havlıyor";
    }
}


class At extends Hayvan {
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Kişniyor";
    }
}
class Kus extends Hayvan {
    public Kus(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Ötüyor...";
    }
}

public class Main {
    public static void konustur(Object object) {
        //System.out.println(object.konus());
        if (object instanceof Kopek) {
            Kopek kopek = (Kopek) object;
            System.out.println(kopek.konus());
        } else if (object instanceof At) {
            At at = (At) object;
            System.out.println(at.konus());
        } else if (object instanceof Kedi) {
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());
        }
        else if (object instanceof Kus) {
            Kus kus = (Kus) object;
            System.out.println(kus.konus());
        }
        else {
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());
        }

    }

    //Bir nesnenin birden farklı nesne gibi davranması
    public static void main(String[] args) {// Alt Classların referansları üst klastaki referansa eşitlenebilir.
      /*  //alltaki classsta override edilmemişse üst sınıftaki çalışır
        Hayvan hayvan = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Limon");
        Hayvan hayvan3 = new At("Mikhail");
        System.out.println(hayvan.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());
        konustur(new Kedi("Akbas"));
        konustur(new Kopek("Karabas"));//köpek referansi hayvan referansına eşitleniyor*/
        //instanceof bir objenin hangi classtan olduğunu anlamak için
        Kopek kopek = new Kopek("Karabaş");
        Kedi kedi = new Kedi("Tekir");
        At at = new At("Şahbatur");
        Hayvan hayvan = new Hayvan("Fındık");
        Kus kus = new Kus("Maya");
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
        konustur(kopek);
        konustur(kus);
        if (kopek instanceof Hayvan) {
            //kopek referansı Kopek sınıfından mıdır
            System.out.println("Bu nesne Hayvan sınıfındandır");//çalışır çıktı verir
        }
    }

}
