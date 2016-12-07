package ch.lazzaretti.exercise12.sub4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fab on 07.12.2016.
 */
public class DateConverter {

    public static String convertUsToEu(String us){
        Pattern pattern = Pattern.compile("^(\\w{3})? (\\d{1,2})?/(\\d{1,2})?/(\\d{4})? (\\d{1,2})?:(\\d{1,2})? (AM|PM)?$");
        Matcher matcher = pattern.matcher(us);
        if(!matcher.find()){
            throw new RuntimeException("Can not find a valid date");
        }
        //Weekday
        String weekday;
        switch (matcher.group(1)){
            case "Mon":
                weekday = "Mo";
                break;
            case "Thu":
                weekday = "Do";
                break;
                //@TODO the rest of the weekdays
            case "Sat":
                weekday = "Sa";
                break;
            case "Sun":
                weekday = "So";
                break;
            default:
                throw new RuntimeException("Invalid weekday "+matcher.group(1));
        }
        String month = matcher.group(2);
        String day = matcher.group(3);
        String year = matcher.group(4);
        String hour = matcher.group(5);
        String minutes = matcher.group(6);
        if(matcher.group(7).equals("PM")){
            if(!hour.equals("12")){
                hour = String.valueOf(Integer.valueOf(hour)+12);
            }
        }else if(hour.equals("12")){
            hour="0";
        }

        String date = weekday+" "+day+"."+month+"."+year+" "+hour+":"+minutes;
        return date;
    }

    public static void main(String[] args){
        System.out.print(convertUsToEu("Thu 12/8/2016 10:15 AM"));
    }
}
