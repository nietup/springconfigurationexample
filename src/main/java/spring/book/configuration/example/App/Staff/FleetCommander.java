package spring.book.configuration.example.App.Staff;

import spring.book.configuration.example.App.Starship.Starship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FleetCommander {
    private List<Starship> fleet;

    public FleetCommander(Starship... starships) {
        fleet = new ArrayList<>();
        Collections.addAll(fleet, starships);
        fleet.forEach(Starship::incrementPower);
    }

    public void command() {
        for (Starship starship : fleet) {
            starship.reportForDuty();
        }
    }
}
