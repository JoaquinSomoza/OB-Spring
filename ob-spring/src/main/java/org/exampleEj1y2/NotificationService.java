package org.exampleEj1y2;

import org.springframework.stereotype.Component;

// Ejercicio 2
// Crear la clase NotificationService, con un método que imprima un saludo.
// Utilizar la anotación @Component en cada clase.
@Component
public class NotificationService {

    public String imprimirSaludo(){
        return "Hola desde notificacionService";
    }
    /*Saludo saludo;

    public NotificationService(Saludo saludo){
         System.out.println("Ejecutando  NotificationService");
        this.saludo = saludo;
    }*/
}
