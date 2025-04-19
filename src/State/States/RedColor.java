package State.States;

import State.TrafficLightContext;

public class RedColor implements TrafficLightState {
    @Override
    public void next(TrafficLightContext trafficLightContext) {
        System.out.println("switching from red to green");
        trafficLightContext.setColor(new GreenColor());
    }

    @Override
    public String getColor() {
        return "Red Color";
    }
}
