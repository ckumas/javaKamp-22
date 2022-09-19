public class Main {
    public static void main(String[] args) {

        //For Döngüsü
        for(int i=1;i<=10;i+=1){

            System.out.println(i+" TS");
        }
        System.out.println("For döngüsü bitti.");

        //While Döngüsü

        int i=1;
        while (i<10){

            System.out.println(i+" while");
            i+=2;
        }
        System.out.println("While döngüsü bitti.");

        //Do-While Döngüsü
        int j=1;
        do {
            System.out.println(j+" do-while");
            j++;
        } while (j<10);
        System.out.println("Do-While döngüsü bitti.");
    }
}