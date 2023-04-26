package day07_SwitchStatement;

public class C10_Substring {
    public static void main(String[] args) {
        String str ="Java Candir";
        // sadece candir kısmını yazdıralım
        System.out.println(str.substring(5));//Candir

        System.out.println(str.substring(2));//va Candir
        System.out.println(str.substring(10));//r
        System.out.println(str.substring(11));// boş satır

       /* System.out.println(str.substring(12));
        StringIndexOutOfBoundsException: String index out of range: -1

        System.out.println(str.substring(22));
        StringIndexOutOfBoundsException: String index out of range: -11
        */
        //sadece Java kısmını yazdıralım
        System.out.println(str.substring(0,4));
        /*
        java da başlangıç ve bitş indexleri verildiğinde
        genellikle  başlangıç index'i dahil(inclusive)
        bitş indexi hariç(exclusive) olur
         */
        System.out.println(str.substring(3,4));//a
        System.out.println(str.substring(1,2));//a
        /*
        eger sadece 1 harf almak istersek substring(harfin indexi,harfin indexi+1)
         */
        System.out.println(str.substring(5,5));//hiçlik
        /*
        System.out.println(str.substring(8,5));
        Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 8, end 5, length 11
         */

        String str2="eSRa";
        //ilk harfini büyük kalanları kucuk olacak şekilde duzenleyin

        str2=str2.substring(0,1).toUpperCase()+str2.substring(1).toLowerCase();

        System.out.println(str2);



    }
}
