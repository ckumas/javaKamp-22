public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Cumhur";
        String ogrenci2 = "Zinnet";
        String ogrenci3 = "Ayşenur";
        String ogrenci4 = "Sedat";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("------------------------------------");
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Cumhur";
        ogrenciler[1] = "Zinnet";
        ogrenciler[2] = "Sedat";
        ogrenciler[3] = "Ayşenur";
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------------------------------");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }


    }


}