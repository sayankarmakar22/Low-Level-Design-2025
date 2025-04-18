package Command;

public class ACRemote {
    GadgetCommands commands;

    public void setCommands(GadgetCommands commands) {
        this.commands = commands;
    }

    public void pressButton(){
        this.commands.execute();
    }
}
