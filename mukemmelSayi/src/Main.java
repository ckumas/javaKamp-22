public class Main {
    public static void main(String[] args) {
         int msayi= 28;
         int total=0;
         for (int i=1;i<msayi;i++) {

             if (msayi % i == 0) {
                 total = total + i;
             }
         }
             if(total==msayi){
                 System.out.println("Mükemmel Sayı: "+msayi+"'dır");
             }else{
                 System.out.println("Mükemmel Sayı: "+msayi+" değildir");
             }
         }
    }
