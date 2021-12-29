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
    private int warningCode;
    private long t2;
    private long t3;

    public Warning(int warningCode, long t2) {
        this.warningCode = warningCode;
        this.t2 = t2;
        t3 = SUtils.DEFAULT_MILLISECOND;
    }

    public void setT3(long t3) {
        this.t3 = t3;
    }

    public void setT3(String t3) {
        if (t3 != null) {
            setT3(Long.parseLong(t3));
        } else {
            setT3(SUtils.DEFAULT_MILLISECOND);
        }
    }

    public String getStrT2() {
        return SUtils.formatDate(t2, SUtils.DATE_FORMAT_HH_MM_SS_MSSS);
    }

    public String getStrT3() {
        return SUtils.formatDate(t3, SUtils.DATE_FORMAT_HH_MM_SS_MSSS);
    }

    public String geWarningStrForTable() {
        String a = "(" + warningCode + ") ";
        String b = SUtils.WARNINGS[warningCode - 1];
        String c = a + b;
        return "(" + warningCode + ") " + SUtils.WARNINGS[warningCode - 1];

    }
}
