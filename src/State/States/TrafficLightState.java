package State.States;

import State.TrafficLightContext;

public interface TrafficLightState {
    void next(TrafficLightContext trafficLightContext);
    String getColor();
}
