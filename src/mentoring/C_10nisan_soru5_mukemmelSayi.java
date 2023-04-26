package mentoring;

public class C_10nisan_soru5_mukemmelSayi {
    public static void main(String[] args) {
        /*
        kendisi haric butun pozitif bolenleri toplami kendisine esit olan
        sayilara mukemmel saylar dedir
        1 ile 1000 arasindaki mukemmel sayilari bulan java prog
        ornegin 6 nin bolenler 1,2,3 toplami 6
         */

        int toplam=0;
        for (int i = 1; i <1000 ; i++) {
            for (int j = 1; j <i ; j++) {
                if (i%j==0){
                    toplam=toplam+j;
                }

            }if (toplam==i){
                System.out.println(i);

            }toplam=0;

        }

    }
}
