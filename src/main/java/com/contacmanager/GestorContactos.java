package com.contacmanager;

import java.util.ArrayList;
import java.util.List;

public class GestorContactos {
    private List<Contacto> contactos;

    public GestorContactos() {
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("Contacto agregado: " + contacto);
    }

    public void eliminarContacto(String nombre) {
        Contacto contactoAEliminar = null;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                contactoAEliminar = contacto;
                break;
            }
        }
        if (contactoAEliminar != null) {
            contactos.remove(contactoAEliminar);
            System.out.println("Contacto eliminado: " + contactoAEliminar);
        } else {
            System.out.println("Contacto no encontrado: " + nombre);
        }
    }

    public void buscarContactoPorNombre(String nombre) {
        boolean encontrado = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado: " + contacto);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado: " + nombre);
        }
    }

    public void mostrarTodosLosContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos para mostrar.");
        } else {
            System.out.println("Lista de contactos:");
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }
}
