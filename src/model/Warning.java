/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import switchutility.SUtils;

/**
 *
 * @author sudiptasharif
 */
public class Warning {
    private int warningCode;
    private long t2;
    private long t3;
    public static HashMap<Integer, String> WARNINGS = new HashMap<>();
        
    public Warning(long t2) {
        this.t2 = t2;
        t3 = SUtils.DEFAULT_MILLISECOND;
    }
    
    public void setT3(long t3) {
        this.t3 = t3;
    }

    public void setT3(String t3) {
        if (t3 != null)
            setT3(Long.parseLong(t3));
        else
            setT3(SUtils.DEFAULT_MILLISECOND);
    }
    
    public String getStrT2() {
        return SUtils.formatDate(t2, SUtils.DATE_FORMAT_HH_MM_SS_MSSS);
    }
    
    public String getStrT3() {
        return SUtils.formatDate(t3, SUtils.DATE_FORMAT_HH_MM_SS_MSSS);
    }
    
    public static void setupWarnings() {
        // ss: Any new warning must be added before "None" warning. 
        // This warning code must match with what is set in the Android app.       
        WARNINGS.put(1, "Stop + Tone");
        WARNINGS.put(2, "Stop + Voice");
        WARNINGS.put(3, "Yeild + Tone");
        WARNINGS.put(4, "Yeild + Voice");
        WARNINGS.put(5, "None");
    }
    
    public static boolean isValidWarningCode(int warningCode) {
        return (WARNINGS.get(warningCode) != null);
    }
    
    public static boolean isWarningNone(int warningCode) {
        return WARNINGS.get(warningCode).equalsIgnoreCase("none");
    }    
}
