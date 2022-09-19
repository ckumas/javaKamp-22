public class Main {
    public static void main(String[] args) {
        char grade = 'Y';

        switch (grade) {

            case 'A':
                System.out.println("Mükemmel Geçtiniz");
                break;
            case 'B':
                System.out.println("Pekiyi Geçtiniz");
                break;
            case 'C':
                System.out.println("Orta Geçtiniz");
                break;
            case 'D':
                System.out.println("Kötü Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");

        }
    }
}