package main.java.br.com.cod3r.factory.apple.after.factory;

import main.java.br.com.cod3r.factory.apple.model.IPhone;
import main.java.br.com.cod3r.factory.apple.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }

}