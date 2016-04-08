
package matriz3d;

import java.util.Scanner;


public class Matriz3D {

    private int mat[][][];
    int codigo = 0;
    int codigo2 = 0;

    public Matriz3D(int filas, int columnas, int profundidad) {
        mat = new int[filas][columnas][profundidad];
    }

    public int[][][] getMat() {
        return mat;
    }

    public void setMat(int[][][] mat) {
        this.mat = mat;
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

    public void asignarElementosID() {
        int count3 = 0;
        for (int k = 0; k < mat[0][0].length; k++) {
            count3++;
        }
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese X: ");
        int x = leer.nextInt();
        System.out.print("Ingrese Y: ");
        int y = leer.nextInt();
        System.out.print("Ingrese Z: ");
        int z = leer.nextInt();
        if (x <= count3 && y <= count3 && z <= count3) {

            for (int p = 0; p < mat[0][0].length; p++) {
                if (p == z) {
                    for (int i = 0; i < mat[0][0].length; i++) {
                        if (x == i) {
                            for (int j = 0; j < mat.length; j++) {
                                if (y == j) {
                                    System.out.print("Valor posicion " + x + "," + y + "," + z + ": ");
                                    mat[x][y][z] = leer.nextInt();
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.print("El tamaño de una o mas de las coordenadas es incorrecto");
        }

    }

    public void querryElementosID() {
        int count3 = 0;
        for (int k = 0; k < mat[0][0].length; k++) {
            count3++;
        }
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese X1: ");
        int x1 = leer.nextInt();
        System.out.print("Ingrese Y1: ");
        int y1 = leer.nextInt();
        System.out.print("Ingrese Z1: ");
        int z1 = leer.nextInt();
        System.out.print("Ingrese X2: ");
        int x2 = leer.nextInt();
        System.out.print("Ingrese Y2: ");
        int y2 = leer.nextInt();
        System.out.print("Ingrese Z2: ");
        int z2 = leer.nextInt();
        if (x1 <= count3 && y1 <= count3 && z1 <= count3 && x2 <= count3 && y2 <= count3 && z2 <= count3) {

            for (int p = 0; p < mat[0][0].length; p++) {
                if (p == z1) {
                    for (int i = 0; i < mat[0][0].length; i++) {
                        if (x1 == i) {
                            for (int j = 0; j < mat.length; j++) {
                                if (y1 == j) {
                                    System.out.println("Valor posicion " + x1 + "," + y1 + "," + z1 + ": ");
                                    codigo = codigo + mat[x1][y1][z1];
                                }
                            }
                        }
                    }
                }
            }
            for (int p = 0; p < mat[0][0].length; p++) {
                if (p == z2) {
                    for (int i = 0; i < mat[0][0].length; i++) {
                        if (x2 == i) {
                            for (int j = 0; j < mat.length; j++) {
                                if (y2 == j) {
                                    System.out.println("Valor posicion " + x2 + "," + y2 + "," + z2 + ": ");
                                    codigo2 = codigo2 + mat[x2][y2][z2];
                                }
                            }
                        }
                    }
                }
            }
            int codigo3=codigo+codigo2;
            System.out.println("Suma igual a    "+codigo3);

        } else {
            System.out.print("El tamaño de una o mas de las coordenadas es incorrecto");
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
