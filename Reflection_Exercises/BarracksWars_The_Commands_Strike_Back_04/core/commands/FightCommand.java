package BarracksWars_The_Commands_Strike_Back_04.core.commands;

import BarracksWars_The_Commands_Strike_Back_04.contracts.Repository;
import BarracksWars_The_Commands_Strike_Back_04.contracts.UnitFactory;

public class FightCommand extends CommandImpl {
    protected FightCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
