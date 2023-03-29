package it.unibz.airport;

import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to the Airport System!\n");

        AirTrafficControl trafficControl = new AirTrafficControl();
        GroundService groundService = new GroundService();
        List<Runaway> runaways = createRunaways(trafficControl, groundService);

        startRunaways(runaways);

        groundService.displayMessage();
        trafficControl.displayMessage();
        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            performRandomRunawayEvent(runaways);
            groundService.displayMessage();
            trafficControl.displayMessage();
            System.out.println();
        }

    }

    private static List<Runaway> createRunaways(AirTrafficControl trafficControl, GroundService groundService) {
        List<Runaway> runaways = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            Runaway runaway = new Runaway("Runaway " + i);
            runaways.add(runaway);
        }
        return runaways;
    }

    private static void startRunaways(List<Runaway> runaways) {
        for (Runaway runaway : runaways) {
            runaway.setClear(true);
        }
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min));
    }

    private static void performRandomRunawayEvent(List<Runaway> runaways) {
        int changingRunawayIndex = getRandomNumber(0, 2);
        Runaway runaway = runaways.get(changingRunawayIndex);
        System.out.println("Changing " + runaway.getName());
        runaway.setClear(!runaway.isClear());
    }

}
