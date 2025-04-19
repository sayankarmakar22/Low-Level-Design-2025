package State;

import State.States.RedColor;
import State.States.TrafficLightState;

public class TrafficLightContext {
    private TrafficLightState lightState; // red color by default

    public TrafficLightContext() {
        this.lightState = new RedColor();
    }

    public void setColor(TrafficLightState lightState) {
        this.lightState = lightState;
    }
    public void next(){
        lightState.next(this);
    }
    public String getColor(){
        return lightState.getColor();
    }
}
