package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.*;
import br.com.cod3r.factory.apple.model.IPhone;

public class AfterClient {

    public static void main(String[] args) {
        IPhoneFactory iPhone11Factory = new IPhone11Factory();
        IPhoneFactory iPhone11ProFactory = new IPhone11ProFactory();
        IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
        IPhoneFactory iPhoneXSMaxFactory = new IPhoneXSMaxFactory();

        System.out.println("### Ordering an iPhone 11");
        IPhone iPhone11 = iPhone11Factory.orderIPhone();
        System.out.println(iPhone11);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iPhone11Pro = iPhone11ProFactory.orderIPhone();
        System.out.println(iPhone11Pro);

        System.out.println("\n\n### Ordering an iPhone X");
        IPhone iPhoneX = iPhoneXFactory.orderIPhone();
        System.out.println(iPhoneX);

        System.out.println("\n\n### Ordering an iPhone X HighEnd");
        IPhone iPhoneXSMax = iPhoneXSMaxFactory.orderIPhone();
        System.out.println(iPhoneXSMax);
    }

}