package main.java.br.com.cod3r.factory.apple.simple;

import main.java.br.com.cod3r.factory.apple.model.IPhone;
import main.java.br.com.cod3r.factory.apple.simple.factory.IPhoneSimpleFactory;

public class SimpleClient {

    public static void main(String[] args) {
        System.out.println("\n### Ordering an iPhone 11");
        IPhone iPhone11 = IPhoneSimpleFactory.orderIPhone("11", "Standard");
        System.out.println(iPhone11);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iPhone11Pro = IPhoneSimpleFactory.orderIPhone("11", "HighEnd");
        System.out.println(iPhone11Pro);

        System.out.println("\n\n### Ordering an iPhone X");
        IPhone iPhoneX = IPhoneSimpleFactory.orderIPhone("X", "Standard");
        System.out.println(iPhoneX);

        System.out.println("\n\n### Ordering an iPhone X HighEnd");
        IPhone iPhoneXSMax = IPhoneSimpleFactory.orderIPhone("X", "HighEnd");
        System.out.println(iPhoneXSMax);
    }

}