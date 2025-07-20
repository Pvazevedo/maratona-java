package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[]{1, 2};
        arrayInt[1] = new int[]{4, 5, 6};
        arrayInt[2] = new int[]{7, 8, 9, 10};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n----" + Arrays.toString(new int[]{arrayBase.length}));
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        //Exemplo de inicialização de array multidimensional
        int[][] arrayInt2 = {{0, 0}, {1, 2, 3,}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase2 : arrayInt2){
            System.out.println("\n----" + Arrays.toString(new int[]{arrayBase2.length}));
            for (int num : arrayBase2){
                System.out.print(num + " ");
            }
        }
    }
}
