package it.unibz.airport;

import java.util.List;
import java.util.Optional;

public class AirTrafficControl implements ServiceSubsriber {

    private Optional<Runaway> availableRunaway = Optional.empty();

    public void displayMessage() {
        if (availableRunaway.isEmpty()) {
            System.out.println("AIR TRAFFIC CONTROL: no runaways available!");
            return;
        }
        System.out.printf("AIR TRAFFIC CONTROL: next available runaway %s%n", availableRunaway.get().getName());
    }

    @Override
    public void update(List<Runaway> runaways) {
        availableRunaway = runaways.stream().filter(Runaway::isClear).findFirst();
    }
}
