package app;
import logistics.Logistics;
import factory.GUIFactory;
import ui.Button;
import ui.Checkbox;

public class DeliveryApplication {
    private final Logistics logistics;
    private final GUIFactory factory;

    public DeliveryApplication(Logistics logistics, GUIFactory factory) {
        this.logistics = logistics;
        this.factory = factory;
    }

    public void run(String cargo, String destination) {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();

        logistics.planDelivery(cargo, destination);
    }
}