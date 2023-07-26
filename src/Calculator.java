public class Calculator {

    public static void osszead (int a, int b){
        int result = a + b;
        System.out.println("A két szám összege: " + result);
    }

    public static void kivon(int a, int b){
        int result = a - b;
        System.out.println("A két szám különbsége: " + result);
    }

    public static void hatvanyoz (int a, int b){
        int result = (int)Math.pow(a, b);
        System.out.println("Az első szám a második számadik hatványon: " + result);



    }



}
