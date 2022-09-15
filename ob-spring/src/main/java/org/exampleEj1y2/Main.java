package org.exampleEj1y2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    // Ejercicio 1.c
    // Obtener el bean desde el método main y ejecutar el método imprimirSaludo.
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Saludo saludo = (Saludo) context.getBean("saludo");

        String texto = saludo.imprimirSaludo();
        System.out.println(texto);

        // Desde el método main, probar a obtener el bean UserService
        // Ejecutar el método imprimirSaludo que tiene asociado el
        // atributo de tipo NotificationService.
        UserService user = (UserService) context.getBean("userService");
        System.out.println(user.notificationService.imprimirSaludo());

    }


}
