package it.unibz.airport;

public class GroundService {

    private int numberOfAvailableRunaways = 0;

    public int getNumberOfAvailableRunaways() {
        return numberOfAvailableRunaways;
    }
    
    public void displayMessage() {
        System.out.println("GROUND SERVICE: Number of free runaways: %d".formatted(getNumberOfAvailableRunaways()));
    }

}
