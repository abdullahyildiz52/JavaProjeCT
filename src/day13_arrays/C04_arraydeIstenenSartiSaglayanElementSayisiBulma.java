package day13_arrays;

public class C04_arraydeIstenenSartiSaglayanElementSayisiBulma {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,1,3,5,7};

        // array de kac tane ciftsayi vaardir yazdirin
        int sayac=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2==0){
                sayac++;


            }

        }
        System.out.println("verilen arraydeki toplam cift sayi sayisi:"+sayac);

        //array de 3 ile bolunebilen kac dsayi vardir yazdirin

        int sayac3ebounen=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%3==0){
                sayac3ebounen++;
            }

        }
        System.out.println("verilen array de 3 e bolunen element sayisi:"+sayac3ebounen);

        // verilen array de 4 ile 8 (sinirlar dahil) kac sayi oldugunu yazdirin

        int sayac4ve8=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>=4 && arr[i]<=8){
                sayac4ve8++;
            }

        }
        System.out.println("verilen arrayde 4 ile 8 arsindaki sayi adedi:"+sayac4ve8);
    }

}
