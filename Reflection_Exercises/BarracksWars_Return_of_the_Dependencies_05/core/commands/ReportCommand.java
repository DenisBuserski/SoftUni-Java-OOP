package BarracksWars_Return_of_the_Dependencies_05.core.commands;

import BarracksWars_Return_of_the_Dependencies_05.contracts.Inject;
import BarracksWars_Return_of_the_Dependencies_05.contracts.Repository;


public class ReportCommand extends CommandImpl {

    @Inject
    private Repository repository;

    protected ReportCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return this.repository.getStatistics();
    }
}
