public class Account {
    private String hesapNo;
    private String ad;
    private double bakiye;

    private String email;
    private String telefonNo;
    public Account() {
      //  System.out.println("Kendi yazdığımız constructor çalıştı.");
        //default değerler atanacak bir constructor
    /*    this.hesapNo = "Bilgi yok";
        this.bakiye = 0.0;
        this.ad= "Bilgi yok";
        this.email = "Bilgi yok";
        this.telefonNo = "Bilgi yok"; // default değerler atanıyor */
        this("Bilgi yok", "Bilgi yok", 0.0, "Bilgi yok", "Bilgi yok"); // Diğer constructor'ı çağırıyoruz
    }
    public Account(String ad, String email, String telefonNo){
     /*   this.ad = ad;
        this.email = email;
        this.telefonNo = telefonNo;
        this.hesapNo = "Bilgi yok"; // varsayılan değer
        this.bakiye = 0.0; // varsayılan değer*/
        this("Bilgi yok", ad, 0.0, email, telefonNo); // Diğer constructor'ı çağırıyoruz ve varsayılan değerler kullanıyoruz
    }
    public Account(String hesapNo, String ad, double bakiye, String email, String telefonNo) {
        this.hesapNo = hesapNo;
        this.ad = ad;
        this.bakiye = bakiye;
        this.email = email;
        this.telefonNo = telefonNo;
    }
    public void bilgileriGoster() {
        System.out.println("Hesap Bilgileri:");
        System.out.println("Hesap No: " + hesapNo);
        System.out.println("Ad: " + ad);
        System.out.println("Bakiye: " + bakiye);
        System.out.println("Email: " + email);
        System.out.println("Telefon No: " + telefonNo);
    }
    public void paraYatir(double miktar) {
        bakiye+= miktar;
        System.out.println("Yeni bakiye: " + bakiye);
    }
    public void paraCekme(double miktar){
        if(miktar >1500){
            System.out.println("Bir günde çekilen miktar 1500'den fazla olamaz.");
        }
        if(miktar > bakiye){
            System.out.println("Yetersiz bakiye.");
        } else {
            bakiye -= miktar;
            System.out.println("Yeni bakiye: " + bakiye);
        }
    }
    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
