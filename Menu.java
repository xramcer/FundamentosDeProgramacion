import java.util.Scanner;

public class GestionArreglos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] datos = null;
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE OPERACIONES =====");
            System.out.println("1. Guardar / Almacenar");
            System.out.println("2. Recorrer (ascendente / descendente)");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Modificar elemento");
            System.out.println("5. Eliminar un elemento");
            System.out.println("6. Eliminar todo el arreglo");
            System.out.println("7. Ordenar (ascendente / descendente)");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            while (!input.hasNextInt()) {
                System.out.print("Ingresa un número válido: ");
                input.next();
            }
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Tamaño del arreglo: ");
                    int tamaño = input.nextInt();
                    datos = new int[tamaño];
                    for (int i = 0; i < tamaño; i++) {
                        System.out.print("Elemento [" + i + "]: ");
                        datos[i] = input.nextInt();
                    }
                    System.out.println("Arreglo guardado correctamente.");
                    break;

                case 2:
                    if (datos == null) {
                        System.out.println("No hay arreglo almacenado.");
                    } else {
                        System.out.print("Recorrer (1) Ascendente o (2) Descendente: ");
                        int dir = input.nextInt();
                        if (dir == 1) {
                            for (int i = 0; i < datos.length; i++) {
                                System.out.print(datos[i] + " ");
                            }
                        } else {
                            for (int i = datos.length - 1; i >= 0; i--) {
                                System.out.print(datos[i] + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (datos == null) {
                        System.out.println("No hay arreglo almacenado.");
                    } else {
                        System.out.print("Valor a buscar: ");
                        int valor = input.nextInt();
                        boolean existe = false;
                        for (int i = 0; i < datos.length; i++) {
                            if (datos[i] == valor) {
                                System.out.println("Elemento encontrado en la posición " + i);
                                existe = true;
                                break;
                            }
                        }
                        if (!existe) System.out.println("Elemento no encontrado.");
                    }
                    break;

                case 4:
                    if (datos == null) {
                        System.out.println("No hay arreglo almacenado.");
                    } else {
                        System.out.print("Posición a modificar: ");
                        int indice = input.nextInt();
                        if (indice >= 0 && indice < datos.length) {
                            System.out.print("Nuevo valor: ");
                            datos[indice] = input.nextInt();
                            System.out.println("Elemento actualizado.");
                        } else {
                            System.out.println("Posición inválida.");
                        }
                    }
                    break;

                case 5:
                    if (datos == null) {
                        System.out.println("No hay arreglo almacenado.");
                    } else {
                        System.out.print("Posición a eliminar: ");
                        int eliminar = input.nextInt();
                        if (eliminar >= 0 && eliminar < datos.length) {
                            int[] nuevo = new int[datos.length - 1];
                            for (int i = 0, j = 0; i < datos.length; i++) {
                                if (i != eliminar) nuevo[j++] = datos[i];
                            }
                            datos = nuevo;
                            System.out.println("Elemento eliminado.");
                        } else {
                            System.out.println("Posición inválida.");
                        }
                    }
                    break;

                case 6:
                    datos = null;
                    System.out.println("Arreglo eliminado completamente.");
                    break;

                case 7:
                    if (datos == null) {
                        System.out.println("No hay arreglo almacenado.");
                    } else {
                        System.out.print("Ordenar (1) Ascendente o (2) Descendente: ");
                        int tipo = input.nextInt();
                        burbuja(datos, tipo == 1);
                        System.out.print("Arreglo ordenado: ");
                        for (int i = 0; i < datos.length; i++) {
                            System.out.print(datos[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        input.close();
    }

    public static void burbuja(int[] arr, boolean ascendente) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if ((ascendente && arr[j] > arr[j + 1]) || (!ascendente && arr[j] < arr[j + 1])) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }
}
