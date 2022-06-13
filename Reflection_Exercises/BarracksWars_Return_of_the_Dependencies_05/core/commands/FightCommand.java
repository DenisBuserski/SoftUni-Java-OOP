package BarracksWars_Return_of_the_Dependencies_05.core.commands;

public class FightCommand extends CommandImpl {
    protected FightCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
