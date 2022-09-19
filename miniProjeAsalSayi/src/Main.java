public class Main {
    public static void main(String[] args) {
        int sayi = 1;
        int remainder = sayi % 2;
        //System.out.println(remainder);
        boolean isPrime = true;
        if (sayi < 1) {
            System.out.println("Sayı asal değil");
            return;
        }
            if (sayi < 1) {
                System.out.println("Geçersiz Sayı");
            }
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    isPrime = false;
                    System.out.println(sayi + " Sayısı " + i + "'ye bölünebilir"); //hangi sayılara bölünebilir kodu
                } else {
                    System.out.println(sayi + " Sayısı " + i + "'ye bölünemez"); //hangi sayılara bölünemez kodu
                }
            }
            if (isPrime == true) {
                System.out.println("Sayı Asaldır.");
            } else {
                System.out.println("Sayı Asal değildir.");
            }
        }
    }
