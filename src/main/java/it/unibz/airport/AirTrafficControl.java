package it.unibz.airport;

public class AirTrafficControl {

    public String findAvailableRunaway(){

        return null;
    }

    public void displayMessage() {

        String availableRunaway = findAvailableRunaway();
        if(availableRunaway == null) {
            System.out.println("AIR TRAFFIC CONTROL: no runaways available!");
        }
        else {
            System.out.printf("AIR TRAFFIC CONTROL: next available runaway %s%n", availableRunaway);
        }
    }

}
