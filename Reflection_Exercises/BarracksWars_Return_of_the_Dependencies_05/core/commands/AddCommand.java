package BarracksWars_Return_of_the_Dependencies_05.core.commands;

import BarracksWars_Return_of_the_Dependencies_05.contracts.Inject;
import BarracksWars_Return_of_the_Dependencies_05.contracts.Repository;
import BarracksWars_Return_of_the_Dependencies_05.contracts.UnitFactory;

public class AddCommand extends CommandImpl {

    @Inject
    private Repository repository;
    @Inject
    private UnitFactory unitFactory;

    public AddCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        this.repository.addUnit(this.unitFactory.createUnit(this.getData()[1]));

        return this.getData()[1] + " added!";
    }
}
