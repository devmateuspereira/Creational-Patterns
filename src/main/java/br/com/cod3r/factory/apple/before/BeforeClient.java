package main.java.br.com.cod3r.factory.apple.before;

import main.java.br.com.cod3r.factory.apple.model.*;

public class BeforeClient {

    public static void main(String[] args) {
        BeforeClient client = new BeforeClient();

        System.out.println("\n### Ordering an iPhone 11");
        IPhone iPhone11 = client.orderIPhone("11", "Standard");
        System.out.println(iPhone11);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iPhone11Pro = client.orderIPhone("11", "HighEnd");
        System.out.println(iPhone11Pro);

        System.out.println("\n\n### Ordering an iPhone X");
        IPhone iPhoneX = client.orderIPhone("X", "Standard");
        System.out.println(iPhoneX);

        System.out.println("\n\n### Ordering an iPhone X HighEnd");
        IPhone iPhoneXSMax = client.orderIPhone("X", "HighEnd");
        System.out.println(iPhoneXSMax);
    }

    private IPhone orderIPhone(String generation, String level) {
        IPhone device = null;

        if (generation.equalsIgnoreCase("X")) {
            if (level.equalsIgnoreCase("Standard")) {
                device = new IPhoneX();
            } else if (level.equalsIgnoreCase("HighEnd")) {
                device = new IPhoneXSMax();
            }
        } else if (generation.equalsIgnoreCase("11")) {
            if (level.equalsIgnoreCase("Standard")) {
                device = new IPhone11();
            } else if (level.equalsIgnoreCase("HighEnd")) {
                device = new IPhone11Pro();
            }
        }

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

}