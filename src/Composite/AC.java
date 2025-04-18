package Composite;

public class AC implements SmartComponent{
    @Override
    public void turnOn() {
        System.out.println("AC is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is turned off");
    }
}
