package org.exampleEj1y2;

import org.springframework.stereotype.Component;

// Crear una clase UserService que tenga un atributo de clase NotificationService.
// Utilizar la anotación @Component en cada clase.
@Component
public class UserService {
    NotificationService notificationService;


    public UserService(NotificationService notificationService){
        System.out.println("Ejecutando constructor UserService");
        this.notificationService = notificationService;

    }


}
