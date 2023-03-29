package it.unibz.airport;

import java.util.ArrayList;
import java.util.List;

public class Runaway {
    
    private boolean isClear;
    private String name;

    public Runaway(String name){
        this.name = name;
        this.isClear = true;
    }

    public String getName() {
        return name;
    }

    public boolean isClear() {
        return isClear;
    }

    public void setClear(boolean isClear) {
        this.isClear = isClear;
    }

}
