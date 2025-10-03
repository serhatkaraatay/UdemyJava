public class Main {
    public static void ucuncu_fonksiyon() {
        int a = 12 / 0; // ArithmeticException
    }

    public static void ikinci_fonksiyon() {
        try {
            ucuncu_fonksiyon();
        } catch (ArithmeticException e) {
            System.out.println("Bir sayı sıfıra bölünemez.");
        }
    }

    public static void birinci_fonksiyon() {
        ikinci_fonksiyon();
    }

    public static void main(String[] args) {
        //İç içe fonksiyonlarda exception handling
        birinci_fonksiyon();

    }
}
