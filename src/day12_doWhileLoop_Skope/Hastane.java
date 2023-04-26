package day12_doWhileLoop_Skope;

public class Hastane {
    static String hastaneIsmi="Yildiz Hastanesi";
    static int personelSayisi;
    String personelIsmi;
    String personelAdresi;
    String personelTelefonu;
    /*
    class leveldda olusyurulan variablelar
    eger tum nesneler icin ortak ise static olarak
    eger her bir nesne icin farkli olacaksa instance variable olarak olusturulur

    bu hastane de 500 personel varsa 500 er tane isim adres telefon olmak zorundadir
    java bunu susekilde cozmus

    bu class tan bir obje olusturuldugunda
    java tum instance variable larin bir kopyasiniolusturup o obje ile ilintilendirir

    tum class variablelar icin deger ataama mecburiyeti yoktur
    eger deger atanirsa o deger gecerlidir
    ancak deger atanmamissa java oo class icin default degerleiri atama yapar

    sayisal variabler : 0
    boolean :false
    char : hiclik ''
    non primitive :null
     */

    public static void main(String[] args) {
        System.out.println(hastaneIsmi);
        System.out.println(personelSayisi);

        Hastane aysehemsire =new Hastane();
        System.out.println(aysehemsire.personelAdresi);
        aysehemsire.personelAdresi="Cankaya";
        aysehemsire.personelIsmi="Ayse";
        aysehemsire.personelTelefonu="3121234565";

        Hastane fatmaHemsire =new Hastane();
        fatmaHemsire.personelIsmi="Fatma";
        fatmaHemsire.personelAdresi="Yenimahalle";
        fatmaHemsire.personelTelefonu="3125847587";

        System.out.println(fatmaHemsire.personelIsmi);//fa
        System.out.println(aysehemsire.personelIsmi);

        // static varbl direk erisim mumkun
        System.out.println(hastaneIsmi);//Yildiz Hastanesi
        System.out.println(personelSayisi); //0

        // obje uzerinden de static variabllara ulasim mumkundur
        // ancak intelij buna gerek yok diyerek bizi uyarir

        System.out.println(aysehemsire.hastaneIsmi); //Yildiz hastanesi

        // static olan hastaneIsmi variableinina instance sekilde ulasildi diye uyari veriyor
        aysehemsire.hastaneIsmi="Levent Hastanesi";

        System.out.println(hastaneIsmi);// Levent Hastanesi
        System.out.println(fatmaHemsire.hastaneIsmi);//  Levent Hastanesi

    }
}
