package Command;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AC ac1 = new AC();

        ACRemote acRemote = new ACRemote();
        acRemote.setCommands(new TurnOnACRemote(ac1));
        acRemote.pressButton();
        acRemote.setCommands(new TurnOffACRemote(ac1));
        acRemote.pressButton();

    }
}
