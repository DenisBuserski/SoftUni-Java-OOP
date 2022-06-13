package BarracksWars_The_Commands_Strike_Back_04.core.commands;

import BarracksWars_The_Commands_Strike_Back_04.contracts.Repository;
import BarracksWars_The_Commands_Strike_Back_04.contracts.UnitFactory;

public class AddCommand extends CommandImpl {

    public AddCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        this.getRepository().addUnit(this.getUnitFactory().createUnit(this.getData()[1]));

        return this.getData()[1] + " added!";
    }
}
