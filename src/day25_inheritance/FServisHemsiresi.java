package day25_inheritance;

public class FServisHemsiresi extends DHemsire {

    String str="Servis hemsiresi";
    int numara=20;
    boolean izindeMi=true;
    public static void main(String[] args) {
        FServisHemsiresi sh1=new FServisHemsiresi();
        sh1.staticolmayanMethod();

    }
    public void staticolmayanMethod(){
        nobet(); //Servis hemsiresi haftada 3 gun nobet tutar
        this.nobet(); // Servis hemsiresi haftada 3 gun nobet tutar
        super.nobet(); //  hemsireler ayda 2 gun nobet tutar

        maas(); //  hemsire maasi:2000
        this.maas(); // hemsire maasi:2000
        super.maas(); // hemsire maasi:2000

        calismaGunu(); // servis hemsireleri haftaada 4 gun calisirlar
        this.calismaGunu(); //  servis hemsireleri haftaada 4 gun calisirlar
        //super.calismaGunu(); // CTE

        String str="mathod";
        System.out.println(str);// mathod
        System.out.println(this.str); //  Servis hemsiresi
       // System.out.println(super.str); CTE

        System.out.println(numara); // 20
        System.out.println(this.numara); // 20
        System.out.println(super.numara); // 30

        System.out.println(izindeMi); // true scope class parent
        System.out.println(this.izindeMi); // true class parent
        System.out.println(super.izindeMi); // false parent

        char ilkHarf='J';
        System.out.println(ilkHarf); // J
        // System.out.println(this.ilkHarf); CTE
        // System.out.println(super.ilkHarf); CTE
    }
    public void nobet(){
        System.out.println("Servis hemsiresi haftada 3 gun nobet tutar");
    }
    public void calismaGunu(){
        System.out.println("servis hemsireleri haftaada 4 gun calisirlar");
    }
}
