/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switchutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author sudiptasharif
 */
public class SUtils {

    public static final String DATE_FORMAT_USER_FRIENDLY = "yyyy-MM-dd hh:mm a";
    public static final String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
    public static final String DATE_FORMAT_HH_MM_SS_MSSS = "hh:mm:ss.SSS";
    public static final String CONNECTION_SUCCESS = "Connection SUCCESSFUL\n";
    public static final String CONNECTION_FAILURE = "Connection FAILED\n\nMake sure server is on\nIn App Press Button: START LISTENING\n";
    public static final int SERVER_ON = 1;
    public static final int SERVER_OFF = 0;
    public static final int INVALID_WARNING_CODE = 0;
    public static final String PARTICIPANT_ID_PROMPT = "Participant ID";
    public static final String PARTICIPANT_ID_PROMPT_WITH_HINT = "Must be a number";
    public static final String PARTICIPANT_NAME_PROMPT = "Participant Name";
    public static final String PARTICIPANT_NAME_PROMPT_WITH_HINT = "Must not be alphanumeric or blank";
    public static final String INVALID_STRING_BLANK = "' '(blank)";
    public static final String INVALID_PARTICIPANT_ID = "Invalid ID";
    public static final String INVALID_PARTICIPANT_NAME = "Invalid Name";
    public static final String[] WARNINGS = {"Stop + Tone", "Stop + Voice", "Yeild + Tone", "Yeild + Voice", "None"};
    public static final int DEFAULT_WARNING_CODE = 1;
    public static final String DEFAULT_T = "--";
    
    public static String formatDate(Calendar calendar, String dateFormatPattern) {
        String formattedDate = "";
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormatPattern);
        Date date = calendar.getTime();
        formattedDate = formatter.format(date);
        return formattedDate;
    }

    public static String formatDate(long timeInMillis, String dateFormatPattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormatPattern);
        return formatter.format(new Date(timeInMillis));
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidName(String str) {
        final int ASCII_A = 65;
        final int ASCII_Z = 90;
        final int ASCII_SPACE = 32;
        int ascii_char;
        boolean isValid = true;
        int i = 0;
        str = str.toUpperCase();
        while (isValid && i < str.length()) {
            ascii_char = (int) str.charAt(i);
            if (!((ascii_char == ASCII_SPACE) || (ascii_char >= ASCII_A && ascii_char <= ASCII_Z))) {
                isValid = false;
            }
            i++;
        }
        return isValid;
    }
    
    public static boolean isValidParticipantID(String participantID) {
        return !((participantID == null) || (participantID.isBlank()) || (!isInteger(participantID.trim())));
    }
    
    public static boolean isValidParticipantName(String participantName) {
        return !((participantName == null) || (participantName.isBlank()) || (!isValidName(participantName.trim())));        
    }
    
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean isValidWarningCode(int warningCode) {
        return ((warningCode >= 1 && warningCode <= WARNINGS.length));
    }
    
    public static boolean isWarningNone(int warningCode) {
        return (isValidWarningCode(warningCode) && WARNINGS[warningCode-1].equalsIgnoreCase("none"));
    }
}