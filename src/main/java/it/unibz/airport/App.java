package it.unibz.airport;

import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to the Airport System!\n");

        AirTrafficControl trafficControl = new AirTrafficControl();
        GroundService groundService = new GroundService();

        RunawayPublisher publisher = new RunawayPublisher();
        publisher.addSubscriber(trafficControl);
        publisher.addSubscriber(groundService);
        publisher.publish();
        publisher.showMessages();

        for (int i = 0; i < 10; i++) {
            publisher.performRandomRunawayEvent();
            publisher.showMessages();
            System.out.println();
        }
    }
}
