package co.com.challenger.starsharp.interactions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMeeting {

    public String nextDay(Date today){
        Calendar date = Calendar.getInstance();
        date.setTime(today);
        date.roll(Calendar.DAY_OF_MONTH, true);
        today = date.getTime();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

        return format.format(today);
    }
    public String dateToday(){

        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate = format.format(today);
        return formattedDate;
    }
}
