package day21_DateTime_Varargs;

public class C10_Varargs {
    public static void main(String[] args) {
        islemYap(2,4);  // 2

        islemYap(5); // 0
        islemYap(5,4,7,8); // 15
    }
    public static void islemYap(int x, int...y){
        System.out.println(x*y.length);

    }
}
