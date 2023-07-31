package br.com.cod3r.abstractfactory.technologies.factory;

import br.com.cod3r.abstractfactory.technologies.services.CarRestApiService;
import br.com.cod3r.abstractfactory.technologies.services.CarService;
import br.com.cod3r.abstractfactory.technologies.services.UserRestApiService;
import br.com.cod3r.abstractfactory.technologies.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }

}