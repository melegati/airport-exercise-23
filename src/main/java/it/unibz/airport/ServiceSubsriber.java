package it.unibz.airport;

import java.util.List;

public interface ServiceSubsriber {

    void update(List<Runaway> runaways);

    void displayMessage();
}
