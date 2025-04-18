package Composite;

public class Light implements SmartComponent{
    @Override
    public void turnOn() {
        System.out.println("light on");
    }

    @Override
    public void turnOff() {
        System.out.println("light off");
    }
}
