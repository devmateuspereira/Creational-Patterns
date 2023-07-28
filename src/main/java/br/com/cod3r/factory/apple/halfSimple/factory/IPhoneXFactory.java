package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {
        if (level.equalsIgnoreCase("Standard")) {
            return new IPhoneX();
        } else if (level.equalsIgnoreCase("HighEnd")) {
            return new IPhoneXSMax();
        } else {
            return null;
        }
    }

}