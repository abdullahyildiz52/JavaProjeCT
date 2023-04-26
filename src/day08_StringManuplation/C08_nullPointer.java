package day08_StringManuplation;

public class C08_nullPointer {
    public static void main(String[] args) {

        /* null bir deger degildir.
        null bir pointer dir
        non-primitive datalara deger atanmadigini isaret eder
         */
        String str; // deger atanmadigi icin  tazdirma vs islemleri yapilamiyor

        //System.out.println(str); // CTE //deger atama yapilmadan normalde yazdirma
        // yapilamaz

        /* yine de deger atamasi yapmadan,bos olarak kalmasini , lakin en azindan yeri geldigi zaman
        en azindan yazdirabilmesini istiyorsak null pointer kullanilir
         */

        str=null; //str a deger atanmadi sadec bos oldugunu belirttik str hala bos

        System.out.println(str); // icnde bir sy olmamasina ragmen null pointer ile
        // en azindan yazdirma islemi yapiliyor

       //  str.concat("ali");
        //  null olan bir deger ile methodlar kullailamaz
            //  Exception in thread "main" java.lang.NullPointerException
             //	at day08_StringManuplation.C08_nullPointer.main(C08_nullPointer.java:24)
        //System.out.println(str.length()); // yok olan bir seyin uzunlugu olculemez
            //Exception in thread "main" java.lang.NullPointerException
            //	at day08_StringManuplation.C08_nullPointer.main(C08_nullPointer.java:28)

        String test =""; // burda testin icinde "" kayit altina alnmis. kullanilabilir
        System.out.println(test.length()); // 0
        System.out.println(str+" Ali "); // null Ali

        Integer sayi= null;

        // str= null,,,,test=""

        // System.out.println(str.isEmpty());  NullPointerException (olmayan birseyin bos
       //  olup olmadigi kontrol edilemez

        System.out.println(test.isEmpty()); // true
        /* null atamasi yapilan bir variale hic b;r method ile kullanilamaz
        yazdirilabilir veya + ile kullanilabilir (concatination)
         */
    }
}
