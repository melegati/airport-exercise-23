package it.unibz.airport;

public class GroundService {

    private int numberOfAvailableRunaways = 0;

    public int getNumberOfAvailableRunaways() {
        return numberOfAvailableRunaways;
    }
    
    public void displayMessage() {
        System.out.printf("GROUND SERVICE: Number of free runaways: %d%n", getNumberOfAvailableRunaways());
    }

}
