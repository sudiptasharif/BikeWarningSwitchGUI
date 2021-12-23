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
    public static final long DEFAULT_MILLISECOND = 0;
    public static final String CONNECTION_SUCCESS = "Connection SUCCESSFUL\n";
    public static final String CONNECTION_FAILURE = "Connection FAILED\n\nMake sure server is on\nIn App Press Button: START LISTENING\n";
    public static final int SERVER_ON = 1;
    public static final int SERVER_OFF = 0;
    public static final int INVALID_WARNING_CODE = 0;
    
    public static String formatDate(Calendar calendar, String dateFormatPattern){
        String formattedDate = "";
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormatPattern);
        Date date = calendar.getTime();
        formattedDate = formatter.format(date);
        return formattedDate;
    }

    public  static String formatDate(long timeInMillis, String dateFormatPattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormatPattern);
        return formatter.format(new Date(timeInMillis));
    }
}
