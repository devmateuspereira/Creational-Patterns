package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {
        if (level.equalsIgnoreCase("Standard")) {
            return new IPhone11();
        } else if (level.equalsIgnoreCase("HighEnd")) {
            return new IPhone11Pro();
        } else {
            return null;
        }
    }

}