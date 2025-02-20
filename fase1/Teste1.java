import java.util.Random;

public class Teste1 {
  static int contador = 0;

    public static void main(String[] args) {
        int[][] A = new int[400][400];
        int[][] B = new int[400][400];


        preencheMatrizAleatoria(A, 0, 10);
        preencheMatrizAleatoria(B, 0, 10);


        int[][] C = new int[A.length][B[0].length];
        C = multiplica(A, B);


        exibeResult(C);
    }
    
    
    public static void preencheMatrizAleatoria(int[][] matriz, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(max - min) + min;
            }
        }
    }

    public static int[][] multiplica(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                    contador++;
      
                }
            }
        }

        return C;
    }


    public static void exibeResult(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

    }
    System.out.println("\nVocê executou:" + contador);
}}