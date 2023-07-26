import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 6 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        int[] szamok = new int[]{1, 3, 6, 7, 10, 11, 18, 19};
        containsNegative(szamok);
        System.out.println();
        biggestNum(szamok);
        System.out.println();

        int biggestNumOnEvenIndex = szamok[0];
        for (int i = 0; i < szamok.length; i++) {
            if (i % 2 == 0 && szamok[i] > biggestNumOnEvenIndex){
                biggestNumOnEvenIndex = szamok[i];
            }
        }
        System.out.println("A páros indexű elemek legnagyobb száma: " + biggestNumOnEvenIndex);



        int a = 3;
        int b = 2;

        Calculator.osszead(a, b);
        Calculator.kivon(a, b);
        Calculator.hatvanyoz(a, b);

        Scanner scan = new Scanner(System.in);
        System.out.println("Adj meg egy egész, pozitív számot!");
        int num1 = scan.nextInt();
        System.out.println("Adj meg még egy egész, pozitív számot!");
        int num2 = scan.nextInt();

        int[][] nmTomb = new int[num1][num2];
        for (int i = 0; i < nmTomb.length; i++) {
            for (int j = 0; j < nmTomb[i].length; j++) {
                nmTomb[i][j] = (int) Math.pow(3, j + i * num1);

            }

        }
        for (int i = 0; i < nmTomb.length; i++) {
            for (int j = 0; j < nmTomb[i].length; j++) {
                System.out.print(nmTomb[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean containsNegative(int[] szamok) {
        boolean contains = false;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] < 0) {
                contains = true;
            }
        }

        if (contains == true) {
            System.out.println("A számtömb tartalmaz negatív számot is");
        } else if (contains == false) {
            System.out.println("A számtömb csak pozitív számokat tartalmaz");
        }
        return contains;
    }

    public static int biggestNum(int[] szamok) {
        int biggest = szamok[0];
        for (int i = 0; i < szamok.length; i++) {
            if (biggest < szamok[i] && szamok[i] % 2 == 0) {
                biggest = szamok[i];
            }
        }
        System.out.println(biggest + " -Ez a legnagyobb páros szám a tömbben");
        return biggest;
    }


}