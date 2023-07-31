package br.com.cod3r.abstractfactory.technologies.factory;

import br.com.cod3r.abstractfactory.technologies.services.CarEJBService;
import br.com.cod3r.abstractfactory.technologies.services.CarService;
import br.com.cod3r.abstractfactory.technologies.services.UserEJBService;
import br.com.cod3r.abstractfactory.technologies.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }

}