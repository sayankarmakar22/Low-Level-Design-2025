package Composite;

public class Main {
    public static void main(String[] args) {

        CompositeSmartComponent room1 = new CompositeSmartComponent();

        room1.addComponent(new AC());
        room1.addComponent(new Light());

        CompositeSmartComponent room2 = new CompositeSmartComponent();
        room2.addComponent(new AC());
        room2.addComponent(new Light());

        CompositeSmartComponent room3 = new CompositeSmartComponent();
        room3.addComponent(new AC());
        room3.addComponent(new Light());

        CompositeSmartComponent floor  = new CompositeSmartComponent();
        floor.addComponent(room1);
        floor.addComponent(room2);
        floor.addComponent(room3);

        CompositeSmartComponent house = new CompositeSmartComponent();
        house.addComponent(floor);

        house.turnOn();


    }
}
