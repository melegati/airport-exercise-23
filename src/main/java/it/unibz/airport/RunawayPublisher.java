package it.unibz.airport;

import java.util.ArrayList;
import java.util.List;

public class RunawayPublisher {
    public List<ServiceSubsriber> subscriberServices = new ArrayList<>();
    public List<Runaway> runaways = createRunaways();

    public RunawayPublisher() {
        startRunaways(runaways);
    }

    public void addSubscriber(ServiceSubsriber ss) {
        subscriberServices.add(ss);
    }

    public void publish() {
        for (ServiceSubsriber s : subscriberServices) {
            s.update(runaways);
        }
    }

    public void showMessages() {
        for (ServiceSubsriber s : subscriberServices) {
            s.displayMessage();
        }
        System.out.println("\n");
    }

    private static List<Runaway> createRunaways() {
        List<Runaway> runaways = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            Runaway runaway = new Runaway("Runaway " + i);
            runaways.add(runaway);
        }
        return runaways;
    }


    public void performRandomRunawayEvent() {
        int changingRunawayIndex = getRandomNumber(0, 2);
        Runaway runaway = runaways.get(changingRunawayIndex);
        System.out.println("Changing " + runaway.getName());
        runaway.setClear(!runaway.isClear());

        publish();
    }

    private static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min));
    }


    private static void startRunaways(List<Runaway> runaways) {
        for (Runaway runaway : runaways) {
            runaway.setClear(true);
        }
    }
}
