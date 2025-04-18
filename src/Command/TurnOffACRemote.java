package Command;

public class TurnOffACRemote implements GadgetCommands{
    AC ac;

    public TurnOffACRemote(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }
}
