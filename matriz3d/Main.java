
package matriz3d;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int f = 0, c = 0,p=0;
        System.out.print("Filas: ");
        f = leer.nextInt();
        System.out.print("Columnas: ");
        c = leer.nextInt();
        System.out.print("Profundidad: ");
        p = leer.nextInt();
        Matriz3D M1 = new Matriz3D(f, c, p);
        M1.inicializarElementos();
        M1.imprimirElementos();
        M1.asignarElementos();
        M1.imprimirElementos();
        M1.ordenarElementos();
        M1.imprimirElementos();
    }

}
