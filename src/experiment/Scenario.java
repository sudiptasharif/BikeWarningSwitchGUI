/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package experiment;

import java.util.ArrayList;

/**
 *
 * @author sudiptasharif
 */
public class Scenario {
    private int scenarioID;
    private ArrayList<Warning> warnings;
    
    public Scenario(int id) {
        scenarioID = id;
    }
    
    public void addWarning(Warning warning) {
        warnings.add(warning);
    }
}
