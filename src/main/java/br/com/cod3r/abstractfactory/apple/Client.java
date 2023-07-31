package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {

    public static void main(String[] args) {
        CountryRulesAbstractFactory brazilianRules = new BrazilianRulesAbstractFactory();
        CountryRulesAbstractFactory usRules = new USRulesAbstractFactory();

        IPhoneFactory gen11Factory = new IPhone11Factory(brazilianRules);
        IPhoneFactory genXFactory = new IPhoneXFactory(usRules);

        System.out.println("\n### Ordering an iPhone 11");
        IPhone iPhone11 = gen11Factory.orderIPhone("Standard");
        System.out.println(iPhone11);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iPhone11Pro = gen11Factory.orderIPhone("HighEnd");
        System.out.println(iPhone11Pro);

        System.out.println("\n\n### Ordering an iPhone X");
        IPhone iPhoneX = genXFactory.orderIPhone("Standard");
        System.out.println(iPhoneX);

        System.out.println("\n\n### Ordering an iPhone X HighEnd");
        IPhone iPhoneXSMax = genXFactory.orderIPhone("HighEnd");
        System.out.println(iPhoneXSMax);
    }

}