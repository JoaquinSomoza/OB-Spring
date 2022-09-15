package org.exampleEj1y2;

import org.springframework.stereotype.Component;

// Ejercicio 1.a
// Crear una clase Saludo con un método imprimirSaludo que imprima un texto por consola.
@Component
public class Saludo {

    public Saludo(){
        System.out.println("Ejecutando constructor saludo");
    }

    public String imprimirSaludo(){
        return "Bienvenido!";
    }
}
