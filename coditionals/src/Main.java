public class Main {
    public static void main(String[] args) {
        int sayi1=22;
        int sayi2=22;

        if(sayi1<sayi2) {

            System.out.println(sayi1+","  +sayi2+"'den küçüktür");

        }else if (sayi1==sayi2){
            System.out.println(sayi1+","   +sayi2+"'ye eşittir");
        } else {
            System.out.println(sayi1+"," +sayi2+"'den büyüktür");
        }
        //tüm şartları girilerek oluşturularak oluşturulan programlar defensing programming denir
    }
}
