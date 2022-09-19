public class Main {
    public static void main(String[] args) {
        int sayi1=61;
        int sayi2=25;
        int sayi3=266;
        int enBuyukSayi=sayi1;

        if(enBuyukSayi<sayi2) {

            enBuyukSayi=sayi2;

        }    else if (enBuyukSayi<sayi3){
            enBuyukSayi=sayi3;
        }

        System.out.println("En Büyük Sayı: "+enBuyukSayi);


        }
}