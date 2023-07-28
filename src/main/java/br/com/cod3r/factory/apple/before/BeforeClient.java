package main.java.br.com.cod3r.factory.apple.before;

import main.java.br.com.cod3r.factory.apple.model.*;

public class BeforeClient {

    public static void main(String[] args) {
        BeforeClient client = new BeforeClient();

        System.out.println("### Ordering an iPhone X");
        IPhone iPhone = client.orderIPhone("X", "Standard");
        System.out.println(iPhone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iPhone2 = client.orderIPhone("11", "HighEnd");
        System.out.println(iPhone2);
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