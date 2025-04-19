package State.States;

import State.TrafficLightContext;

public class YellowColor implements TrafficLightState {
    @Override
    public void next(TrafficLightContext trafficLightContext) {
        System.out.println("switching from yellow to red");
        trafficLightContext.setColor(new RedColor());
    }

    @Override
    public String getColor() {
        return "Yellow color";
    }
}
