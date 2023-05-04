package day25_inheritance;

public class EBasHemsire extends DHemsire{
    EBasHemsire(){
        System.out.println(adres);
        adres="Cankaya";
        System.out.println(gorev);// BasHemsire
        System.out.println("genel gorev:" + super.gorev);
        isim="Ayse";
        System.out.println(this.isim);// ayse
        System.out.println(super.isim); // ayse
        this.maas();// bashemsire maasi:3000
        super.maas(); // hemsire maasi:2000
        nobet(); // Bashemsireler ayda 3 gun nobet tutar
        this.nobet(); // Bashemsireler ayda 3 gun nobet tutar
        super.nobet(); // hemsireler ayda 2 gun nobet tutar

        ozelSigorta(); //hemsireler ozel sigorta yaptirabilir
        this.ozelSigorta(); // hemsireler ozel sigorta yaptirabilir
        super.ozelSigorta(); // hemsireler ozel sigorta yaptirabilir

        tazminat(); //
        this.tazminat(); //
        /*
        super.tazminat; //CTE
        inheirtance de childe da yoksa parente bakilir
        ama parentte yoksa childe bakilmaz
         */
    }
    String gorev="BasHemsire";
    String adres="Adres belirtilmedi";

    @Override
    public void maas() {
        System.out.println("bashemsire maasi:"+3000);


    }
    public void nobet(){
        System.out.println("Bashemsireler ayda 3 gun nobet tutar");
    }
    public void tazminat(){
        System.out.println("bashemsireler 13.maas alirlar");
    }

    public static void main(String[] args) {

        EBasHemsire bh1=new EBasHemsire();


    }
}
