package br.com.cod3r.abstractfactory.technologies.services;

public class UserRestApiService implements UserService {

    @Override
    public void save(String name) {
        System.out.println("Saving " + name + " through Rest's interface");
    }

    @Override
    public void delete(Integer id) {
        System.out.println("Removing User #" + id + " through Rest's interface");
    }

}