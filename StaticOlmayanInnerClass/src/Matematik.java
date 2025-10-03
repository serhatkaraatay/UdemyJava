import java.util.Scanner;

public class Matematik {
    private double PI = Math.PI;

    public class Factorial {
        //Inner class
        public void faktoriyel() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bir sayı giriniz: : ");
            int n = sc.nextInt();
            int toplam = 1;
            for (int i = 2; i <= n; i++) {
                toplam *= i;
            }
            System.out.println("Faktöriyel: " + toplam);
        }
    }
        public class Asal {
            public boolean asal_mi(int sayi) {
                int i = 2;

                while (i < sayi) {
                    if (sayi % i == 0) {
                        return false;
                    }
                    i++;

                }
                return true;
            }
        }
        public class Alan{
        public class DarireAlan{
            public void daire_alan(int yaricap){
                System.out.println("Dairenin alanı : " + (yaricap*yaricap*PI));
            }
        }


        }
    }

