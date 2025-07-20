package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 Meses
//        31,28,31,30 dias
        int[][] dias = new int[4][3];

        // o primeiro array [4] guarda somente referências a outros arrays
//      // os valores do primeiro array [0] [1] [2] [3] são:
        System.out.println(dias[0]); // [I@15aeb7ab
        System.out.println(dias[1]); // [I@7b23ec81
        System.out.println(dias[2]); // [I@6acbcfc0
        System.out.println(dias[3]); // [I@5f184fc6

        // Agora os valores dos 2 Array [0][0] [1][0] [2][0] [3][0] são
        System.out.println(dias[0][0]); // 0
        System.out.println(dias[1][0]); // 0
        System.out.println(dias[2][0]); // 0
        System.out.println(dias[3][0]); // 0
        // Os valores dos arrays [0][1] [1][1] [2][1] [3][1] seguem sendo zero(array int é inicializado com zero)

        //Declarando valores nos arrays

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        dias[2][0] = 31;
        dias[2][1] = 31;
        dias[2][2] = 30;

        dias[3][0] = 31;
        dias[3][1] = 30;
        dias[3][2] = 31;

        System.out.println("Quantidade de Dias de cada mês:");
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------------");
        System.out.println("Quantidade de Dias - For each");
        for (int[] arrayBase:dias){
            for (int numDias: arrayBase){
                System.out.println(numDias);
            }
        }

        // Porém e com um array 3 dimensional?
        int[][][] matriz = new int[4][3][2];
        // sendo [i][j][k]

        // A lógica se mantém a matriz [i] é uma referência a matriz [j][k]
        // E a matriz [j][k] é uma referência a matriz [k]
        // E a matriz[k] faz referência aos arrays de tipo primitivo INT.




    }
}
