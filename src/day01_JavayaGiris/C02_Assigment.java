package day01_JavayaGiris;

public class C02_Assigment {

    public static void main(String[] args) {

        int sayi;

        sayi=20;


    // java değer atanmadan varble oluşturmaya izin verir
        //ama değer atanmadan cte verir.
        System.out.println(sayi);   //20

        sayi=sayi+10;
        System.out.println(sayi); //30

        sayi=2*sayi;
        System.out.println(sayi); //60

        //int sayi=50
        //data türü yukarıda tanımlandığı için altını kırmızı çizer expected hatası verir
    }
}
/*
    java da bir kodun altı kırmızı çizgi varsa orada compile time error CTE VARDIR
    EĞER projenin herhangi bir yerinde cte varsa o projedeki hiç
    bir class çalışmaz

 */
