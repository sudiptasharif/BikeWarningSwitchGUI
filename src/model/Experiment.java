/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author sudiptasharif
 */
public class Experiment {
    private Calendar startDateTime;
    private Calendar stopDateTime;
    private ArrayList<Scenario> scenarios;
    
    public Experiment() {
        startDateTime = Calendar.getInstance();
        scenarios = new ArrayList<>();
    }
    
    public void addScenario(Scenario scenario) {
        scenarios.add(scenario);
    }
    
    public void stopExperiment() {
        stopDateTime = Calendar.getInstance();
        // TODO: need to dump to text file
    }
}
