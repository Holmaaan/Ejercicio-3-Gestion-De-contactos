package com.contacmanager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GestorContactos gestorContactos = new GestorContactos();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\nGestor de Contactos");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto por nombre");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Teléfono: ");
                        String telefono = scanner.nextLine();
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        gestorContactos.agregarContacto(new Contacto(nombre, telefono, email));
                        break;
                    case 2:
                        System.out.print("Nombre del contacto a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        gestorContactos.eliminarContacto(nombreEliminar);
                        break;
                    case 3:
                        System.out.print("Nombre del contacto a buscar: ");
                        String nombreBuscar = scanner.nextLine();
                        gestorContactos.buscarContactoPorNombre(nombreBuscar);
                        break;
                    case 4:
                        gestorContactos.mostrarTodosLosContactos();
                        break;
                    case 5:
                        System.out.println("Saliendo del gestor de contactos.");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción del 1 al 5.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido para la opción.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        scanner.close();
    }
}
