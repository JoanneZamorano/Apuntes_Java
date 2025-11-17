package Estructuras_basicas.Uso_3_Matriz;

import java.util.Random;

public class UsoMatriz {
    public static void main(String[] args) {
        int[][] matriz2 = {
                {1,2,3,4},
                {10,25,31,80},
                {120,358,620,755}
        };

        //Recorrer la matriz pero con FOR ANIDADO
        for (int i=0; i<matriz2.length; i++){
            for (int j=0; j<matriz2[i].length;j++){
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
        /*----TERMINAL:
        1	2	3	4
        10	25	31	80
        120	358	620	755 */

        //cambiar un valor:
        matriz2[1][1]=30;

        //Recorrer la matriz pero con FOR-EACH
        for (int[] fila:matriz2){
            for (int celda:fila){
                System.out.print(celda + "\t");
            }
            System.out.println();
        }
        /*----TERMINAL:
        1	2	3	4
        10	30	31	80
        120	358	620	755	*/

        //--------------------------
        System.out.println("\n----------Otra matriz:");
        int [][] matriz = new int[4][4];
        Random random = new Random();

        for (int i=0; i<4; i++){
            for (int j=0; j<4;j++){
                matriz[i][j]=random.nextInt(100)+1;
            }
        }

        for (int[] fila:matriz){
            for (int celda:fila){
                System.out.print(celda + "\t");
            }
            System.out.println();
        }


    }
}
