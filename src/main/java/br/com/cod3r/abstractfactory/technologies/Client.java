package br.com.cod3r.abstractfactory.technologies;

import br.com.cod3r.abstractfactory.technologies.factory.EJBAbstractFactory;
import br.com.cod3r.abstractfactory.technologies.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.technologies.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.technologies.services.CarService;
import br.com.cod3r.abstractfactory.technologies.services.UserService;

public class Client {

    public static void main(String[] args) {
        ServicesAbstractFactory ejbAbstractFactory = new EJBAbstractFactory();
        ServicesAbstractFactory restAbstractFactory = new RestAbstractFactory();

        System.out.println();

        UserService userService = ejbAbstractFactory.getUserService();
        userService.save("Mateus");
        userService.delete(5);

        System.out.println();

        CarService carService = restAbstractFactory.getCarService();
        carService.save("Prius");
        carService.update("Tesla X");
    }

}