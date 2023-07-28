package main.java.br.com.cod3r.factory.apple.after.factory;

import main.java.br.com.cod3r.factory.apple.model.IPhone;
import main.java.br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }

}