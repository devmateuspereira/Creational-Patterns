package br.com.cod3r.abstractfactory.technologies.factory;

import br.com.cod3r.abstractfactory.technologies.services.CarService;
import br.com.cod3r.abstractfactory.technologies.services.UserService;

public interface ServicesAbstractFactory {

    UserService getUserService();

    CarService getCarService();

}