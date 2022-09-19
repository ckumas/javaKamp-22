public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[4][4];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Kocaeli";
        sehirler[0][3] = "Edirne";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Yozgat";
        sehirler[1][2] = "Konya";
        sehirler[1][3] = "Kırşehir";
        sehirler[2][0] = "İzmir";
        sehirler[2][1] = "Aydın";
        sehirler[2][2] = "Manisa";
        sehirler[2][3] = "Balıkesir";
        sehirler[3][0] = "Antalye";
        sehirler[3][1] = "Muğla";
        sehirler[3][2] = "Mersin";
        sehirler[3][3] = "Adana";

        for (int i = 0; i <= 3; i++) {
            System.out.println("---------------");
            for (int j = 0; j <= 3; j++)
            {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}