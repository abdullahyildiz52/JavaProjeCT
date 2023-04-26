package day04_İncrement_Concatenation;

public class C06_LogicalOperator {
    public static void main(String[] args) {
        /*
        javada karşılaştırma operatörleri SADECE 2 VARİABLE Yİ karşılaşrıtır
         */
        int a=10;
        int b=20;
        int c=15;

        // üçünün birbirine eşit olduğunu kontrol ediniz
        System.out.println(a==b&&b==c ); // false

        // a sayısının pozitif ve 2 ile tam bölünebilir olduğunu kontrol edin
        System.out.println(a>0 & a%2==0); // true

        //b sayısının 10 ile 50  arasında olduğunu kontrol edin
        System.out.println(b>10 && b<50); // true

        //b sayısının 10 ile 50 arasında olmadığını kontrol edin,
        System.out.println(b<10 || 50<b); // false
    }
}
