
package matriz3d;

import java.util.Scanner;


public class Matriz3D {

    private int mat[][][];

    public Matriz3D(int filas, int columnas, int profundidad) {
        mat = new int[filas][columnas][proundidad];
    }

    public void inicializarElementos() {
        for (int p = 0; p < mat[0][0].length; p++) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    mat[i][j][p] = 0;
                }
            }
        }
    }

    public void asignarElementos() {
        Scanner leer = new Scanner(System.in);
        for (int p = 0; p < mat[0][0].length; p++) {
            System.out.println("Cara # " + p);
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    System.out.print("Valor posicion " + i + "," + j + "," + p + ": ");
                    mat[i][j][p] = leer.nextInt();
                }
            }
        }
    }

    public void imprimirElementos() {
        for (int p = 0; p < mat[0][0].length; p++) {
            System.out.println("Cara # " + p);
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    System.out.print(mat[i][j][p] + ",");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public void ordenarElementos() {
        int aux = 0;
        for (int p = 0; p < mat[0][0].length; p++) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    for (int k = 0; k < mat.length; k++) {
                        for (int m = 0; m < mat[0].length; m++) {
                            if (mat[i][j][p] < mat[k][m][p]) {
                                aux = mat[i][j][p];
                                mat[i][j][p] = mat[k][m][p];
                                mat[k][m][p] = aux;
                            }
                        }
                    }
                }
            }
        }
    }
}
