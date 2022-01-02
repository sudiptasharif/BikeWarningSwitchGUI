/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import switchutility.SUtils;
/**
 *
 * @author sudiptasharif
 */
public class Warning {
    private static final String[] WARNINGS = {"Stop + Tone", "Stop + Voice", "Yeild + Tone", "Yeild + Voice", "None"};
    private int warningCode;
    private String t2;
    private String t3;

    public Warning(int warningCode, String t2) {
        this.warningCode = warningCode;
        this.t2 = t2;
        this.t3 = "--";
    }

    public void setT3(String t3) {
        this.t3 = t3;
    }

    public String getT2() {
        return t2;
    }

    public String getT3() {
        return t3;
    }

    public String geWarningStrForTable() {
        return "(" + warningCode + ") " + getWarningByCode(warningCode);

    }
    
    public static boolean isValidWarningCode(int warningCode) {
        return ((warningCode >= 1 && warningCode <= WARNINGS.length));
    }

    public static boolean isWarningNone(int warningCode) {
        return (isValidWarningCode(warningCode) && WARNINGS[warningCode - 1].equalsIgnoreCase("none"));
    }  
    
    public static String[] getAllWarnings() {
        String[] warningList = new String[WARNINGS.length];
        for(int i = 0; i < warningList.length; i++) {
            warningList[i] = WARNINGS[i];
        }
        return warningList;
    }
    
    public static String getWarningByCode(int warningCode) {
        return isValidWarningCode(warningCode) ? WARNINGS[warningCode-1] : "";
    }    
}
