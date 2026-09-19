package app;
import logistics.*;
import factory.*;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <ROAD|SEA> <WINDOWS|MACOS>");
            return;
        }

        String deliveryMode = args[0].toUpperCase();
        String platform = args[1].toUpperCase();

        Logistics logistics;
        GUIFactory factory;

        switch (deliveryMode) {
            case "ROAD": logistics = new RoadLogistics(); break;
            case "SEA": logistics = new SeaLogistics(); break;
            default:
                System.out.println("Unsupported delivery mode: " + deliveryMode);
                return;
        }

        switch (platform) {
            case "WINDOWS": factory = new WindowsFactory(); break;
            case "MACOS": factory = new MacOSFactory(); break;
            default:
                System.out.println("Unsupported platform: " + platform);
                return;
        }

        DeliveryApplication app = new DeliveryApplication(logistics, factory);
        app.run("Laboratory equipment", "Aktau warehouse");
    }
}
