package main.java.br.com.cod3r.factory.apple.simple.factory;

import main.java.br.com.cod3r.factory.apple.model.*;

public class IPhoneSimpleFactory {

    public static IPhone orderIPhone(String generation, String level) {
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