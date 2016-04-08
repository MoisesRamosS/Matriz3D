package matriz3d;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite el Numero de Test a realizar : ");
        int T = leer.nextInt();
        if (T <= 50) {
            int count2 = 0;
            while (count2 < T) {
                System.out.println("Numero de test : " + count2);
                boolean exit = false;
                String valor_menu = "";

                int f = 0, c = 0, p = 0;
                System.out.print("Tamaño de la Matriz: ");
                f = leer.nextInt();
                c = f;
                p = f;
                Matriz3D M1 = new Matriz3D(f, c, p);
                M1.inicializarElementos();
                M1.imprimirElementos();

                if (f <= 100) {
                    System.out.print("Numero Operaciones: ");
                    int cons = leer.nextInt();
                    if (cons <= 1000) {

                        int count = 0;

                        while (count <= cons) {
                            System.out.println("Numero de Operaciones : " + count);

                            System.out.println("\t     Menu         ");
                            System.out.println("\t1 - UPDATE    ");
                            System.out.println("\t2 - QUERRY ");
                            System.out.println("\t3 - Salir        ");
                            System.out.println("");
                            System.out.print("\tIngrese valor del Menú :");
                            valor_menu = leer.nextLine();

                            switch (valor_menu) {
                                case ("1"):

                                    M1.asignarElementosID();
                                    M1.imprimirElementos();

                                    break;
                                case ("2"):
                                    M1.imprimirElementos();
                                    M1.querryElementosID();
                                   
                                    break;

                                case ("3"):
                                    exit = true;
                                    System.out.println("\tHas Salido del menu");
                                    break;
                                default:
                                    exit = false;
                                    System.out.println("\tOpcion no valida");
                                    System.out.println("");
                                    break;
                            }
                            count++;

                        }
                    } else {
                        System.out.println("Numero de consultas debe ser menor a 1000");

                    }
                } else {
                    System.out.println("Tamaño de matriz menor 100");

                }
                count2++;
            }
        } else {
            System.out.println("Numero de pruebas debe ser menor a 50");

        }
    }
}
