package it.unibz.airport;

import java.util.List;

public class GroundService implements ServiceSubsriber {

    private int numberOfAvailableRunaways = 0;


    public void displayMessage() {
        System.out.printf("GROUND SERVICE: Number of free runaways: %d%n", numberOfAvailableRunaways);
    }

    @Override
    public void update(List<Runaway> runaways) {
        numberOfAvailableRunaways = (int) runaways.stream().filter(Runaway::isClear).count();
    }
}
