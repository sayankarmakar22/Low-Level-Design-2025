package State.States;

import State.TrafficLightContext;

public class GreenColor implements TrafficLightState {
    @Override
    public void next(TrafficLightContext trafficLightContext) {
        System.out.println("switching from green to yellow");
        trafficLightContext.setColor(new YellowColor());
    }

    @Override
    public String getColor() {
        return "Yellow Color";
    }
}
