package main.java.br.com.cod3r.factory.apple.after.factory;

import main.java.br.com.cod3r.factory.apple.model.IPhone;
import main.java.br.com.cod3r.factory.apple.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }

}