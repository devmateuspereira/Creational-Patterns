package br.com.cod3r.abstractfactory.apple.factory;

import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone11;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    public IPhone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public IPhone createIPhone(String level) {
        if (level.equals("Standard")) {
            return new IPhone11(rules);
        } else if (level.equals("HighEnd")) {
            return new IPhone11Pro(rules);
        } else {
            return null;
        }
    }

}