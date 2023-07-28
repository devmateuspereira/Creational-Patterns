package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class HalfSimpleClient {

    public static void main(String[] args) {
        IPhoneFactory gen11Factory = new IPhone11Factory();
        IPhoneFactory genXFactory = new IPhoneXFactory();

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